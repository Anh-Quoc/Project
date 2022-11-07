import java.awt.*;
import java.io.IOException;
import java.net.URI;

class Start {
    public static void main(String[] args) throws IOException, InterruptedException {
        FileControl.get();

        for (int i = 0; i < StartInterface.listPictures.size() && i < StartInterface.NumPictureToDownload; ++i) {
            try {
                openLink(StartInterface.listPictures.get(i).getLink());
                Thread.sleep(StartInterface.TimeToDelay);
            } catch (IOException e) {
                e.printStackTrace();
                FileControl.set();
            }
        }
    }

    public static void openLink(String LinkPicture) throws IOException {
        Desktop desktop = Desktop.getDesktop();
        desktop.browse(URI.create(LinkPicture));
    }
}