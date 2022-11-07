package HTMLProset;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class SplitElement {

    public static ArrayList<String> GetElement_td(String tr_Element) {
        ArrayList<String> ListElement_td = new ArrayList<>();
        while (tr_Element.contains("<td")) {
            ListElement_td.add(tr_Element.substring(tr_Element.indexOf("<td"), tr_Element.indexOf("</td>") + 5));
            tr_Element = tr_Element.substring(tr_Element.indexOf("</td>") + 5);
        }
        return ListElement_td;
    }

    public static void GetElement_tr() throws IOException {
        String TableData = GetTableData();
        Data.tr_Element.clear();
        while (TableData.contains("<tr>")) {
            Data.tr_Element.add(TableData.substring(TableData.indexOf("<tr>"), TableData.indexOf("</tr>") + 5));
            TableData = TableData.substring(TableData.indexOf("</tr>") + 5);
        }
    }

    public static String GetTableData() throws IOException {
        String WebsiteHtml = getContentFrom(Data.LinkJ2teamFshare);
        return WebsiteHtml.substring(WebsiteHtml.indexOf("<table"), WebsiteHtml.indexOf("</table>") + 8);
    }

    public static String getContentFrom(String Link) throws IOException {
        // Gởi HTTP request và nhận về kết quả là chuỗi các thẻ HTML
        URL url = new URL(Link);
        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
        scanner.useDelimiter("\\\\Z");
        String content = scanner.next();
        scanner.close();
        // xoá các ký tự ngắt dòng (xuống dòng)
        content = content.replaceAll("\\\\R", "");
        return content;
    }
}
