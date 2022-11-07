import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        String urlImage = "https://playingcardsio.s3.amazonaws.com/games/joking-hazard/";
        for(int i = 321; i <= 360; ++i ){
            saveImage(urlImage + createNameFile(String.valueOf(i)));
        }
    }

    private static String createNameFile(String stt){
        while (stt.length() < 3){
            stt = "0" + stt;
        }
        return stt + ".png";
    }

    public static void saveImage(String imageUrl) throws IOException {
        URL url = new URL(imageUrl);
        String fileName = url.getFile();
        String destName = "image_" + fileName.substring(fileName.lastIndexOf("/") + 1);
        destName = "/" + destName;
        System.out.println(destName);

        InputStream is = url.openStream();
        OutputStream os = new FileOutputStream(destName);

        byte[] b = new byte[2048];
        int length;

        while ((length = is.read(b)) != -1) {
            os.write(b, 0, length);
        }

        is.close();
        os.close();
    }
}
