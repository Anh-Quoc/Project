
public class MainGame implements MainInterface{
    public static void main(String[] args) {
       
        GameStart();
        
    }

    public static void GameStart(){       
        
        while (GameMenu() == true){
            String WordInput = scUserInput.nextLine();
            int CountWorld = 0;
            for (String WordsInDictionary : arr) {
                if (WordsInDictionary.indexOf(WordInput) == 0 && WordsInDictionary.indexOf(WordInput + " ") == 0) {
                    System.out.println(WordsInDictionary);
                    ++CountWorld;
                }
            }        
            
        } 
    }

    public static boolean GameMenu(){
        System.out.print("(1) Start");
        System.out.println("(2) Exit");

        return scUserInput.nextLine().equals("1");                
    }

    public static boolean GameOver() {
        System.out.println("Game Over!");

        return GameMenu();
    }

    public static void GetData() {
        while (scUserInput.hasNextLine()) {
            arr.add(scUserInput.nextLine());
        }
    }
}