public class Subject implements MainInteface {
    private String TenHocPhan;
    private Integer SoTinCHi;
    private Double DiemHocPhan;


    public Subject(){
        setTenHocPhan();
        setSoTinCHi();
        setDiemHocPhan();
    }

    public void setTenHocPhan() {
        TenHocPhan = sc.nextLine();
    }

    public void setSoTinCHi() {
        SoTinCHi = sc.nextInt();
    }

    public void setDiemHocPhan() {
        DiemHocPhan = sc.nextDouble();
    }

    public String getTenHocPhan() {
        return TenHocPhan;
    }

    public Integer getSoTinCHi() {
        return SoTinCHi;
    }

    public Double getDiemHocPhan() {
        return DiemHocPhan;
    }
}