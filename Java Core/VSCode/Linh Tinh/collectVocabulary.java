import java.io.File; 
import java.io.FileNotFoundException;
import java.util.*;

class collectVocabulary {

	private static ArrayList<String> listVocabulary = new ArrayList<String>();
	private static ArrayList<String> listMeaning = new ArrayList<String>();

	public static void main(String[] args) {
		File vocaFile = new File("E:\\Java Core\\VSCode\\Linh Tinh\\voca.txt");
		try{
			
			Scanner sc = new Scanner(vocaFile);
			// System.out.println(sc.nextLine() + " : " + sc.nextLine());
			while (sc.hasNextLine()) {
   //      		String data = sc.nextLine();
   //      		if(data.length() > 0){
   //      			listVocabulary.add(data);
   //      			listMeaning.add(sc.nextLine());
   //      		}
				String a = sc.nextLine();
				String b = sc.nextLine();
        		System.out.println( a + " : " + b);
      		}
      		sc.close();
		} catch (FileNotFoundException e) {
      		System.out.println("An error occurred.");
      		e.printStackTrace();
    	}

    	// for(int i = 0; i < listVocabulary.size(); ++i){
    	// 	System.out.println(listVocabulary.get(i) + " : " + listMeaning.get(i));
    	// }
	}
}