package com.example.quizgames;

import androidx.appcompat.app.AppCompatActivity;


import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class start_Game extends AppCompatActivity {

    public final int widthScreen = Resources.getSystem().getDisplayMetrics().widthPixels;
    public final int heightScreen = Resources.getSystem().getDisplayMetrics().heightPixels;

    private Button btn_Option_A;
    private Button btn_Option_B;
    private Button btn_Option_C;
    private Button btn_Option_D;
    private TextView textQuestion;
    private int numberOfQuestion = 0;

    private int numberOfCorrect = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_game);

        btn_Option_A = findViewById(R.id.btn_Option_A);
        btn_Option_B = findViewById(R.id.btn_Option_B);
        btn_Option_C = findViewById(R.id.btn_Option_C);
        btn_Option_D = findViewById(R.id.btn_Option_D);
        textQuestion = findViewById(R.id.textQuestion);

        setPropertyTextQuestion();
        setQuestion(numberOfQuestion);

    }

    private void setPropertyTextQuestion(){
        LinearLayout.LayoutParams textParams = (LinearLayout.LayoutParams) textQuestion.getLayoutParams();
        textParams.height = heightScreen * 60 / 100;

    }

    private void setPropertyButtonOption(){

    }

    private void nextQuestion(){
        if(numberOfQuestion + 1 < mainInterface.listQuestion.size()){
            ++numberOfQuestion;
            setQuestion(numberOfQuestion);
        } else {
            numberOfQuestion = 0;
        }

    }


    private void setQuestion(int numberOfQuestion){
        setTextOption(numberOfQuestion);
        textQuestion.setText(mainInterface.listQuestion.get(numberOfQuestion).getQuestionTitle());
    }

    private void setTextOption(int numberOfQuestion){
        btn_Option_A.setText(mainInterface.listQuestion.get(numberOfQuestion).getOption_A());
        btn_Option_B.setText(mainInterface.listQuestion.get(numberOfQuestion).getOption_B());
        btn_Option_C.setText(mainInterface.listQuestion.get(numberOfQuestion).getOption_C());
        btn_Option_D.setText(mainInterface.listQuestion.get(numberOfQuestion).getOption_D());
    }

    private boolean checkAnswer(String option, String answer){
        return option.equals(answer);
    }

    public void clickOption_A(View view){

        nextQuestion();
    }

    public void clickOption_B(View view){
        nextQuestion();
    }
    public void clickOption_C(View view){
        nextQuestion();
    }

    public void clickOption_D(View view){
        nextQuestion();
    }

}