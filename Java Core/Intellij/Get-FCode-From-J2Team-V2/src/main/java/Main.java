
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.net.URI;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final int delayTime = 3;
        int count = 1;
        while (true) {
            System.out.println("Count: " + count);
            Elements tagTbody = connectWebsite().getElementsByTag("tbody");
            getTagTr(tagTbody);
            ++count;
            TimeUnit.SECONDS.sleep(delayTime);
        }
    }

    public static void getTagTr(Elements tagTbody){
            Elements tagTr = tagTbody.first().getElementsByTag("tr");
            getTagTd(tagTr);
    }

    public static void getTagTd(Elements tagTr){
        for(Element elementTr : tagTr){
            Elements tagTd = elementTr.getElementsByTag("td");
            getTagSpan(tagTd);
        }
    }

    public static void getTagSpan(Elements tagTd){
//        String fCodeDemo = tagTd.get(0).text();
//        String date = tagTd.get(1).getElementsByTag("span").text();
//        String name = tagTd.get(2).text();
        String valueFCodeRemaining = tagTd.get(3).getElementsByTag("span").text();
        String valueFCodePast = tagTd.get(4).getElementsByTag("span").text();
        String linkFCode = tagTd.get(5).getElementsByTag("a").attr("href");

        if(checkFCode(valueFCodeRemaining, valueFCodePast)){
            getFCode(linkFCode);
        }
    }

    public static boolean checkFCode(String valueFCodeRemaining, String valueFCodePast){
        return Integer.parseInt(valueFCodePast) <= Integer.parseInt(valueFCodeRemaining);
    }

    public static void getFCode(String linkFCode){
        try {
            java.awt.Desktop.getDesktop().browse(URI.create(linkFCode));
        } catch (Exception e){
            System.out.println(e);
        }

    }

    public static Document connectWebsite(){
        Document doc = null;
        try{
            doc = Jsoup.connect("https://j2team.dev/fshare-code").get();
        } catch (Exception e){
            System.out.println(e);
        }
        return doc;
    }
}
