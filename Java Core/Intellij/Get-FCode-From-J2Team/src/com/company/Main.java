package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;

public class Main {

    private static final String LinkWebsite = "https://j2team.dev/fshare-code";
    private static final ArrayList<FCode> ListOfFCode = new ArrayList<>();
    private static final int NumberOfUserGetFCode = 200;

    private static final int TimeDelay = 20000; // 20s

    public static void main(String[] args) throws IOException, InterruptedException {
        Menu();

        int ReloadTimes = 0;
        while(!FCodeIsValuable()){
            ++ReloadTimes;
            System.out.println("Reload Times " + ReloadTimes );

            String WebFormHTML = "";
            try{
                WebFormHTML = getContentFrom();

                FileWriter fr = new FileWriter("Data\\WebFormHTML.html");
                fr.write(WebFormHTML);
                fr.close();

                CreateFCode(GetLineFCode(getTableFCode(WebFormHTML)));
                FCodeIsValuable();
            } catch (Exception e){
                System.out.println(e.toString());
            }

            Thread.sleep(TimeDelay);
        }
    }

    private static String getTableFCode(String WebFormHTML) {

        return WebFormHTML.substring(WebFormHTML.indexOf("<tbody>"),WebFormHTML.indexOf("</tbody>"));
    }

    private static String[] GetLineFCode(String TableFCode) {

        return TableFCode.split("<tr>");
    }

    private static void CreateFCode(String[] LineFCode) {
        for (int i = 1 ; i < LineFCode.length ; ++i) {
//
//            FileWriter fr = new FileWriter("Data\\Line" + i + ".html");
//            fr.write(LineFCode[i].replaceAll("</tr>",""));
//            fr.close();

            FCode fCode = new FCode(LineFCode[i].replaceAll("</tr>",""));
            ListOfFCode.add(fCode);
        }
    }

    private static boolean FCodeIsValuable() throws IOException {
//        if(!ListOfFCode.isEmpty()){
            for (FCode fCode : ListOfFCode) {
                if (fCode.getNumberOfUserTaken() <= NumberOfUserGetFCode) {
                    FCodeFound(fCode);
                    Desktop desktop = Desktop.getDesktop();
                    desktop.browse(URI.create(fCode.getLinkToFCode()));
                    return true;
                }
            }
//        }
        return false;
    }

    private static void Menu(){
        System.out.println();
        System.out.println("Program Is Running");

    }

    private static void FCodeFound(FCode fCode){
        System.out.println("FCode found successful!");
        System.out.println(fCode.getCode());
        System.out.println(fCode.getTimePublic());
        System.out.println(fCode.getSharers());
        System.out.println(fCode.getNumberOfUserTaken());
        System.out.println(fCode.getLinkToFCode());
    }

    private static String getContentFrom() throws IOException {
        // Gởi HTTP request và nhận về kết quả là chuỗi các thẻ HTML
        URL url = new URL(Main.LinkWebsite);
        Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
        scanner.useDelimiter("\\\\Z");
        String content = scanner.next();
        scanner.close();
        // xoá các ký tự ngắt dòng (xuống dòng)
        content = content.replaceAll("\\\\R", "");
        return content;
    }
}
