package co.example.demo.model;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Scraping {

    public static final String url = "https://www.youtube.com/watch?v=Kr2Zx179k2U&t";

    public static Document getHtmlDocument(String url) {

        Document doc = null;
        try {
            doc = Jsoup.connect(url).userAgent("Chrome").timeout(100000).get();
        } catch (IOException ex) {
            System.out.println("Excepción al obtener el HTML de la página" + ex.getMessage());
        }
        return doc;
    }

    public static int getStatusConnectionCode(String url) {

       Connection.Response response = null;

        try {
            response = Jsoup.connect(url).userAgent("Chrome").timeout(100000).ignoreHttpErrors(true).execute();
        } catch (IOException ex) {
            System.out.println("Excepción al obtener el Status Code: " + ex.getMessage());
        }
        return response.statusCode();
    }

    public static void main (String args[]) {

        // Compruebo si me da un 200 al hacer la petición
        if (getStatusConnectionCode(url) == 200) {

            // Obtengo el HTML de la web en un objeto Document
            Document document = getHtmlDocument(url);

            // Busco todas las entradas que estan dentro de:
            Elements entradas = document.select("div.col-md-4.col-xs-12").not("div.col-md-offset-2.col-md-4.col-xs-12");
            System.out.println("Número de entradas en la página inicial de Jarroba: "+entradas.size()+"\n");

            // Paseo cada una de las entradas
            for (Element elem : entradas) {
                String tituloVideo = elem.getElementsByClass("tituloPost").text();
                String descripcion = elem.getElementsByClass("autor").toString();
                String nombreCanal = elem.getElementsByClass("fecha").text();

                System.out.println(tituloVideo+"\n"+descripcion+"\n"+nombreCanal+"\n\n");

                // Con el método "text()" obtengo el contenido que hay dentro de las etiquetas HTML
                // Con el método "toString()" obtengo todo el HTML con etiquetas incluidas
            }

        }else
            System.out.println("El Status Code no es OK es: "+getStatusConnectionCode(url));
    }
}