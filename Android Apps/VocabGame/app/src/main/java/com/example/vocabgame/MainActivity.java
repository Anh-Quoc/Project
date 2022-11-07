package com.example.vocabgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> data = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getDataFromFile();

        TextView tx = findViewById(R.id.textView);



    }

    public void getDataFromFile(){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(getResources().openRawResource(R.raw.dictionary)))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("_", " ");
                data.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}