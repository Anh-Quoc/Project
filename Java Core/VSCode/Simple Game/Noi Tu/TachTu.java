import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;

public class TachTu {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(Paths.get("Data\\VN.txt"));
        FileWriter fr = new FileWriter("Data\\VN2.txt");

        while(sc.hasNextLine()){
            String cau = sc.nextLine();
            if(cau.contains(" ")){
                fr.write(cau + "\n");
            }
        }

        sc.close();
        fr.close();
    }

 
}