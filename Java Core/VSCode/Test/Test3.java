import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.Random;

class Test3 {
	public static void main(String[] args) {
		
		System.out.println(getRandomIDImage());		
	}


    private static int getRandomIDImage(){
        Random ran = new Random();
        return ran.nextInt(8);
    }

}