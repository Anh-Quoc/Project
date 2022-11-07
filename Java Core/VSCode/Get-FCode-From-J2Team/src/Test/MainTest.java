package Test;

import javax.imageio.ImageIO;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class MainTest {
//    public static void main(String[] args) throws InterruptedException {
//
//        Robot bot = null;
//        try {
//            bot = new Robot();
//        } catch (Exception failed) {
//            System.err.println("Failed instantiating Robot: " + failed);
//        }
//        int mask = InputEvent.BUTTON1_DOWN_MASK;
//        Thread.sleep(20);
//
//        assert bot != null;
//        bot.mouseMove(447, 450);
//        bot.mousePress(mask);
//        bot.mouseRelease(mask);
//
//        Thread.sleep(2000);
//        bot.mouseMove(710,536);
//        bot.mousePress(mask);
//        bot.mouseRelease(mask);
//
//    }

    public static void main(String[] args) {
        BufferedImage PageCaptcha = null;
        BufferedImage Captcha = null;
        File fPageCaptcha = null;
        File fCaptcha = null;
        try {
            fPageCaptcha = new File("src\\Test\\PageCaptcha.png");
            fCaptcha = new File("src\\Test\\Captcha.png");
            PageCaptcha = ImageIO.read(fPageCaptcha);
            Captcha = ImageIO.read(fCaptcha);
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        assert PageCaptcha != null;
//        System.out.println(Captcha.getWidth() * Captcha.getHeight());
//        System.out.println(PageCaptcha.getWidth() * PageCaptcha.getHeight());

//        System.out.println(Check(Captcha, PageCaptcha));
//        assert Captcha != null;
//        int p = Captcha.getRGB(0,0);
//
//        int a = (p >> 24) & 0xff;
//        int r = (p >> 16) & 0xff;
//        int g = (p >> 8) & 0xff;
//        int b = p & 0xff;
//
//        System.out.println(a);
//        System.out.println(r);
//        System.out.println(g);
//        System.out.println(b);

    }

}
