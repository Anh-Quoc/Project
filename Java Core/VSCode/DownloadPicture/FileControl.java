
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileControl {

    public static void get() throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream(StartInterface.LinkFile);
        Scanner scFile = new Scanner(fileInputStream);
        while (scFile.hasNextLine()) {
            Picture newPic = new Picture(scFile.nextLine());
            StartInterface.listPictures.add(newPic);
        }
        scFile.close();
    }

    public static void set() throws IOException {
        FileWriter fr = new FileWriter(StartInterface.LinkFile);
        for (Picture pic : StartInterface.listPictures) {
            fr.write(pic.getName() + " " + pic.getLink());
        }
        fr.close();
    }
}
