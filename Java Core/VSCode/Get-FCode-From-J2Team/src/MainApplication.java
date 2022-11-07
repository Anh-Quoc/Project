import HTMLProset.Data;
import HTMLProset.FCode;
import HTMLProset.SplitElement;

import java.awt.*;
import java.io.IOException;
import java.net.URI;

public class MainApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        int ReloadTime = 0;
        while (Start()) {
            ++ReloadTime;
            System.out.println("Reload In Time: " + ReloadTime);
            Thread.sleep(Data.TimeDelay);
        }
    }

    public static boolean Start() throws IOException {
        SplitElement.GetElement_tr();
        for (int i = 1; i < Data.tr_Element.size(); ++i) {
            FCode newFcode = new FCode(Data.tr_Element.get(i));
            if (newFcode.ISValuable()) {
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(URI.create(newFcode.getLink()));
                return false;
            }
        }
        return true;
    }

}
