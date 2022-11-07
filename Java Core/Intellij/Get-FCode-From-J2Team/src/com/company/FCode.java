package com.company;

public class FCode {
    private String Code;
    private String TimePublic;
    private String Sharers;
    private String NumberOfUserTaken;
    private String LinkToGetFCode;

    public FCode(String LineFCode){
        
        String[] LineFCodeArray = LineFCode.split("<td");
//        for(int i = 0 ; i < LineFCodeArray.length ; ++i){
//            System.out.println(LineFCodeArray[i]);
//            System.out.println("-------"+ i +"---------");
//        }

        setCode(LineFCodeArray[1]);
        setTimePublic(LineFCodeArray[2]);
        setSharers(LineFCodeArray[3]);
        setNumberOfUserTaken(LineFCodeArray[4]);
        setLinkToGetFCode(LineFCodeArray[5]);
    }

    public void setCode(String FCodeInHtml) {
        Code = FCodeInHtml.substring(FCodeInHtml.indexOf(">"),FCodeInHtml.indexOf("<"));
    }

    public void setTimePublic(String TimeInHtml) {
        TimeInHtml = TimePublic.substring(TimeInHtml.indexOf("<span"),TimeInHtml.indexOf("</span>"));
        TimePublic = TimeInHtml.substring(TimeInHtml.indexOf(">"));
    }

    public void setSharers(String SharersInHtml) {
        Sharers = SharersInHtml.substring(SharersInHtml.indexOf(">") + 1,SharersInHtml.indexOf("<"));
    }

    public void setNumberOfUserTaken(String NumberInHtml) {
        NumberInHtml = NumberInHtml.substring(NumberInHtml.indexOf("text-info") + 11);
        NumberOfUserTaken = NumberInHtml.substring(0, NumberInHtml.indexOf("</span>"));
    }

    public void setLinkToGetFCode(String LinkInHtml) {
//        System.out.println(LinkInHtml);
//        System.out.println(LinkInHtml.indexOf("https"));
//        System.out.println(LinkInHtml.indexOf(" class") - 2);
        LinkToGetFCode = LinkInHtml.substring(LinkInHtml.indexOf("https"), LinkInHtml.indexOf("btn") - 9);
    }

    public String getCode() {
        return Code;
    }

    public String getTimePublic() {
        return TimePublic;
    }

    public String getSharers() {
        return Sharers;
    }

    public int getNumberOfUserTaken() {
//        System.out.println(NumberOfUserTaken);
        return Integer.parseInt(NumberOfUserTaken);
    }

    public String getLinkToFCode() {
        return LinkToGetFCode;
    }

}
