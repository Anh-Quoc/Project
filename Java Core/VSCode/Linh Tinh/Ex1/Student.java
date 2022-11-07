import java.util.ArrayList;

public class Student implements MainInteface {
    private String MaSoSinhVien;
    private String HoVaTen;
    private Date NgaySinh;
    private String GioiTinh;
    private String Lop;
    private ArrayList<Subject> DanhSachDiem;

    public Student(){
        setMaSoSinhVien();
        setHoVaTen();
        setNgaySinh();
        setGioiTinh();
        setLop();
        setDanhSachDiem();
    }

    public void setMaSoSinhVien() {

    }

    public void setHoVaTen() {

    }

    public void setNgaySinh() {

    }

    public void setGioiTinh() {

    }

    public void setLop() {

    }

    public void setDanhSachDiem() {
        Subject newSubject = new Subject();
        DanhSachDiem.add(newSubject);
    }

    public String getMaSoSinhVien() {
        return MaSoSinhVien;
    }

    public String getHoVaTen() {
        return HoVaTen;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public String getLop() {
        return Lop;
    }
}
