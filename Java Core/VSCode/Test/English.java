pimport java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class English {
	public static void main(String[] argus) throws FileNotFoundException {
		File textPath = new File("DT.txt");

		System.out.println("Tu Tieng Anh: ");
		getEng(textPath);
		System.out.println("Phien Am: ");
		getPhienAm(textPath);
		System.out.println("Nghia: ");
		getNghia(textPath);
	}

	public static void getEng(File textPath) throws FileNotFoundException {
		Scanner sc = new Scanner(textPath);
		while (sc.hasNext()) {
			String eng = sc.nextLine();
			eng = eng.substring(eng.indexOf(" "), eng.indexOf("/"));
			System.out.println(eng);
		}
		sc.close();
	}

	public static void getPhienAm(File textPath) throws FileNotFoundException {
		Scanner sc = new Scanner(textPath);
		while (sc.hasNext()) {
			String phienAm = sc.nextLine();
			phienAm = phienAm.substring(phienAm.indexOf("/") + 1, phienAm.lastIndexOf("/"));
			System.out.println(phienAm);
		}
		sc.close();
	}

	public static void getNghia(File textPath) throws FileNotFoundException {
		Scanner sc = new Scanner(textPath);
		while (sc.hasNext()) {
			String nghia = sc.nextLine();
			nghia = nghia.substring(nghia.lastIndexOf("/") + 2);
			System.out.println(nghia);
		}
		sc.close();
	}
	public static void test(){
		Scanner sc = new Scanner(System.in);
		
	}
}
