package com.example.quizgames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
        makeQuestion();
    }

    public void startGame(View view){
        Intent intent = new Intent(MainActivity.this, start_Game.class);
        startActivity(intent);
    }

    private void getData() {
        InputStream inputStream = getResources().openRawResource(R.raw.question_data);
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(inputStream));

        String eachline;
        try {
            eachline = bufferedReader.readLine();
            while (eachline != null) {
                mainInterface.listDataQuestion.add(eachline);
                eachline = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void makeQuestion(){
        for(String data : mainInterface.listDataQuestion){
            Question newQuestion = new Question(data);
            mainInterface.listQuestion.add(newQuestion);
        }
    }

}