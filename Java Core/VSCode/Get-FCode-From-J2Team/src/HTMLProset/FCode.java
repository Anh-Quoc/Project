package HTMLProset;

import java.util.ArrayList;

public class FCode {
    private String MaFshare;
    private String ThoiGianDang;
    private String NguoiDang;
    private String SoNguoiDaLay;
    private String Link;
    private ArrayList<String> td_Element;

    public FCode(String tr_Element){
        td_Element = SplitElement.GetElement_td(tr_Element);
//        setMaFshare(td_Element.get(0));
//        setThoiGianDang(td_Element.get(1));
//        setNguoiDang(td_Element.get(2));
        setSoNguoiDaLay(td_Element.get(3));
        setLink(td_Element.get(4));
    }
    // <td scope="row" class="text-primary">4********3</td>
    public void setMaFshare(String maFshare) {
        MaFshare = maFshare.substring(maFshare.indexOf(">") + 1, maFshare.indexOf("</"));
    }
    // <span title="23 giờ trước">26/01/2021 05:01 PM</span>
    public void setThoiGianDang(String thoiGianDang){
        thoiGianDang = thoiGianDang.substring(thoiGianDang.indexOf("<span"), thoiGianDang.indexOf("</span>") + 7);
        ThoiGianDang = thoiGianDang.substring(thoiGianDang.indexOf("title=") + 7, thoiGianDang.indexOf(">") - 1);
        ThoiGianDang += " (" + thoiGianDang.substring(thoiGianDang.indexOf(">") + 1, thoiGianDang.indexOf("</")) + ")";
    }
    // <td>Biển Phí Quang</td>
    public void setNguoiDang(String nguoiDang) {
        NguoiDang = nguoiDang.substring(nguoiDang.indexOf(">") + 1, nguoiDang.indexOf("</"));
    }

    //  <td class="text-center"><span class="text-info">77</span> lần</td>
    public void setSoNguoiDaLay(String soNguoiDaLay) {
        soNguoiDaLay = soNguoiDaLay.substring(soNguoiDaLay.indexOf("<span"), soNguoiDaLay.indexOf("</span>") + 7);
        SoNguoiDaLay = soNguoiDaLay.substring(soNguoiDaLay.indexOf(">") + 1, soNguoiDaLay.indexOf("</"));
    }
    // <a href="https://j2team.dev/fshare-code/view/1165" class="btn btn-primary btn-xs" target="_blank" rel="noopener">Húp ngay</a>
    public void setLink(String link){
        link = link.substring(link.indexOf("<a"), link.indexOf("</a>") + 4);
        Link = link.substring(link.indexOf("href") + 6, link.indexOf("class") - 2);
    }

    public String getMaFshare() {
        return MaFshare;
    }

    public String getThoiGianDang() {
        return ThoiGianDang;
    }

    public String getNguoiDang() {
        return NguoiDang;
    }

    public String getLink() {
        return Link;
    }

    public int getSoNguoiDaLay() {
        return Integer.parseInt(SoNguoiDaLay);
    }

    public boolean ISValuable(){
        return getSoNguoiDaLay() <= Data.AmountPeopleGetFCode;
    }
}
