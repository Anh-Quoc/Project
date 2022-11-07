package com.example.quizgames;

public class DataProcess {

    public static String cutStringDataFrom(String string_Need_Cut, int start){
        for (int i = 0; i < start; ++i) {
            string_Need_Cut = string_Need_Cut.substring(string_Need_Cut.indexOf("|") + 1);
        }
        return string_Need_Cut.substring(0, string_Need_Cut.indexOf("|"));
    }

}
