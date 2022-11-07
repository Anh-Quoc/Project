
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

class TinhDiemThi {
    public static void main(String[] args) throws IOException {
    
        System.out.print("Nhap ma de: ");
        Scanner sc = new Scanner(System.in);
        String MaDe = sc.nextLine();
        sc.close();

        Scanner scDapAn = new Scanner(Paths.get("DapAn-" + MaDe +".txt"));
        Scanner scBaiLam = new Scanner(Paths.get("BaiLam-q.txt"));

        ArrayList<String> DapAn = new ArrayList<>();
        ArrayList<String> BaiLam = new ArrayList<>();

        while(scDapAn.hasNextLine()){
            DapAn.add(scDapAn.nextLine());
            BaiLam.add(scBaiLam.nextLine());
        }

        scDapAn.close();
        scBaiLam.close();
        
        TinhDiem(DapAn, BaiLam);
        ChiTietCauDungSai(DapAn, BaiLam);
    }

    public static void TinhDiem(ArrayList<String> DapAn , Arr ayList<String> BaiLam){
        int SoCauDung = 0;
        for(int i = 0 ; i < BaiLam.size(); ++i){
            if(BaiLam.get(i).equals(DapAn.get(i))){
                ++SoCauDung;
            }
        }        
        System.out.println("So cau dung: " + SoCauDung + "/40");
        System.out.println("Diem cua may: " + (SoCauDung * 0.2));
    }

    public static void ChiTietCauDungSai(ArrayList<String> DapAn , ArrayList<String> BaiLam){
        ArrayList<Integer> CacCauDung = new ArrayList<>();
        ArrayList<Integer> CacCauSai = new ArrayList<>();

        for(int i = 0 ; i < DapAn.size(); ++i){
            if(BaiLam.get(i).equals(DapAn.get(i))){
                CacCauDung.add(i + 1);
            } else {
                CacCauSai.add(i + 1);
            }
        }

        InCacCauDungSai(CacCauDung, CacCauSai);
    }

    public static void InCacCauDungSai(ArrayList<Integer> CacCauDung , ArrayList<Integer> CacCauSai){
        int iDung = 0;
        int iSai = 0;
        System.out.println("Dung    Sai");
        for(int i = 1 ; i <= 50 ; ++i){
            if(iDung < CacCauDung.size() && i == CacCauDung.get(iDung) ){
                System.out.println(" " + CacCauDung.get(iDung));
                ++iDung;
            } else if(iSai < CacCauSai.size()){
                System.out.println("         " + CacCauSai.get(iSai));
                ++iSai;
            }
        }
    }
}