import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Document doc = Jsoup.connect("https://j2team.dev/fshare-code").get();
        Elements textInfo = doc.getElementsByClass("text-center");

        int i = 0;
        int j = 0;
        String link = "";
        for (Element element : textInfo) {
            if (element.text().contains("lần")) {
                String number = element.getElementsByClass("text-info").text();
                int value = Integer.parseInt(number);
                if (value < 5) {
                    System.out.println(value);
                    j=i;
                }

            }
            if(i==j+1){
                link = element.getElementsByTag("a").attr("href");
                System.out.println(link);
            }

            i++;
        }

    }
}
