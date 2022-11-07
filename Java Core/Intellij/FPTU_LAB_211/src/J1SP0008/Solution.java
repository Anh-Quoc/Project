package J1SP0008;

import MainProject.Localized;
import MainProject.SolutionExercise;

import java.util.HashMap;

public class Solution extends SolutionExercise {

    // Other way to solve this problem is use StringTokenizer

    private String yourContent = "";

    public void run_J1SP0008(){
        createStringFromInput();
        countLetters();
        countCharacters();
        printTheNumberOf(Localized.mapOfLetter);
        printTheNumberOf(Localized.mapOfCharacters);
    }

    private void createStringFromInput(){
        System.out.println(Localized.input_Message_Your_Content);
        yourContent = Localized.sc.nextLine();
    }

    private void countLetters(){
        String[] letterArray = yourContent.split(" ");
        for(String letter : letterArray){
            Localized.mapOfLetter.merge(letter, 1, Integer::sum);
        }
    }

    private void countCharacters(){
        String newContent = yourContent.replaceAll(" ", "");
        String[] charactersArray = newContent.split("");
        for(String characters : charactersArray){
            Localized.mapOfCharacters.merge(characters, 1, Integer::sum);
        }
    }

    private void printTheNumberOf(HashMap<String, Integer> mapAnswer){
        StringBuilder answer = new StringBuilder("{");
        for(String key : mapAnswer.keySet()){
            answer.append(Localized.commaPunctuation).append(key).append("=").append(mapAnswer.get(key)).append(" ");
        }
        answer.append("}");
        System.out.println(answer.toString().replace("{,", "{"));
    }

}
