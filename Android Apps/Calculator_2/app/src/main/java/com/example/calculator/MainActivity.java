package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    final int screenWidth = Resources.getSystem().getDisplayMetrics().widthPixels;
    final int screenHeight = Resources.getSystem().getDisplayMetrics().heightPixels;

    final int[] allButtonID = {R.id.btn_clearAll, R.id.btn_backSpace, R.id.btn_percent, R.id.btn_division,
                                R.id.btn_number_7, R.id.btn_number_8, R.id.btn_number_9, R.id.btn_asterisk,
                                R.id.btn_number_4, R.id.btn_number_5, R.id.btn_number_6, R.id.btn_minus,
                                R.id.btn_number_1, R.id.btn_number_2, R.id.btn_number_3, R.id.btn_plus,
                                R.id.btn_number_0, R.id.btn_dot, R.id.btn_equals};

    Calculation calculation = new Calculation();
    ArrayList<Integer> listIDTextView = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setPropertyLinearAnswer();
        setPropertyKeyboard();
//        addToTextCalculation();
//        listIDTextView.add(R.id.textAnswer);
//        listIDTextView.add(R.id.textCalculation);
//        for(int i = 1; i < 10; ++i) {
            createTextView();
//        }
//        saveHistoryOfCalculationInToFile();
//        getHistoryOfCalculationFromFile();
//        int index = 0;
//        for(int ID : listIDTextView){
//            TextView tx = findViewById(ID);
//            tx.setText(mainInterface.listCalculation.get(index));
//            ++index;
//        }

    }

    private void createTextView(){
        LinearLayout linearTextView = findViewById(R.id.layoutAnswer);

        TextView newTextCalculation = new TextView(
                new ContextThemeWrapper(this, R.style.textView_textCalculation));
        newTextCalculation.setId(createIDTextView());
        TextView newTextAnswer = new TextView(
                new ContextThemeWrapper(this, R.style.textView_textAnswer));
        newTextAnswer.setId(createIDTextView());
        newTextAnswer.setText(getString(R.string.number_0));

        linearTextView.addView(newTextCalculation);
        linearTextView.addView(newTextAnswer);

    }

    private int createIDTextView(){
        if(listIDTextView.isEmpty()){
            listIDTextView.add(1);
        } else {
            listIDTextView.add(listIDTextView.get(listIDTextView.size() - 1) + 1);
        }

        return listIDTextView.get(listIDTextView.size() - 1);
    }

    private void setPropertyKeyboard(){
        TableLayout tbKeyBoard = findViewById(R.id.tableKeyboard);
        ViewGroup.LayoutParams layoutParams = tbKeyBoard.getLayoutParams();
        layoutParams.height = screenHeight / 2;

        setPropertyAllButton();
    }

    private void setPropertyAllButton(){
        for (int idButton : allButtonID) {
            setPropertyEachButton(idButton);
        }
    }

    private void setPropertyEachButton(int idButton){
        Button btn = findViewById(idButton);
        LinearLayout.LayoutParams btnLayout = (LinearLayout.LayoutParams) btn.getLayoutParams();
        btnLayout.leftMargin = screenWidth * 2 / 100;
        btnLayout.rightMargin = screenWidth * 2 / 100;
        btnLayout.width = screenWidth * 20 / 100;
        btnLayout.height = screenHeight * 9 / 100;
    }

    private void setPropertyLinearAnswer(){
        LinearLayout linearAnswer = findViewById(R.id.linearAnswer);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearAnswer.getLayoutParams();
        layoutParams.height = screenHeight * 41 / 100;

        setPropertyScrollViewAnswer();
    }


    private void setPropertyScrollViewAnswer(){
//        ScrollView scrollView = findViewById(R.id.scrollViewAnswer);
//        scrollView.scrollTo(0, scrollView.getBottom());


//        setPropertyTextCalculation(R.id.textCalculation);
//        setPropertyTextAnswer(R.id.textAnswer);

        setPropertyTextView();
    }

    private void setPropertyTextView(){
        for(int i = 0; i < listIDTextView.size(); ++i){
            if(i % 2 == 0){
                setPropertyTextCalculation(i);
            } else {
                setPropertyTextAnswer(i);
            }
        }
    }

    private void setPropertyTextCalculation(int idTextCalculation){
        TextView textCalculation = findViewById(idTextCalculation);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textCalculation.getLayoutParams();
        textCalculation.setMovementMethod(new ScrollingMovementMethod());
        layoutParams.rightMargin = screenWidth * 2 / 100;
        layoutParams.leftMargin = screenWidth * 2 / 100;
    }

    private void setPropertyTextAnswer(int idTextAnswer){
        TextView textAnswer = findViewById(idTextAnswer);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textAnswer.getLayoutParams();
        layoutParams.rightMargin = screenWidth * 2 / 100;
        layoutParams.leftMargin = screenWidth * 2 / 100;
    }

    public void onClickNumber_0(View v){
        if(!calculation.isEmpty()){
            calculation.addNumber(getString(R.string.number_0));
            addCalculationToTextView();
            addAnswerToTextView();
        }
    }
    public void onClickNumber_1(View v){
        calculation.addNumber(getString(R.string.number_1));
        addCalculationToTextView();
        addAnswerToTextView();
    }
    public void onClickNumber_2(View v){
        calculation.addNumber(getString(R.string.number_2));
        addCalculationToTextView();
        addAnswerToTextView();
    }
    public void onClickNumber_3(View v){
        calculation.addNumber(getString(R.string.number_3));
        addCalculationToTextView();
        addAnswerToTextView();
    }
    public void onClickNumber_4(View v){
        calculation.addNumber(getString(R.string.number_4));
        addCalculationToTextView();
        addAnswerToTextView();
    }
    public void onClickNumber_5(View v){
        calculation.addNumber(getString(R.string.number_5));
        addCalculationToTextView();
        addAnswerToTextView();
    }
    public void onClickNumber_6(View v){
        calculation.addNumber(getString(R.string.number_6));
        addCalculationToTextView();
        addAnswerToTextView();
    }
    public void onClickNumber_7(View v){
        calculation.addNumber(getString(R.string.number_7));
        addCalculationToTextView();
        addAnswerToTextView();
    }
    public void onClickNumber_8(View v){
        calculation.addNumber(getString(R.string.number_8));
        addCalculationToTextView();
        addAnswerToTextView();
    }
    public void onClickNumber_9(View v){
        calculation.addNumber(getString(R.string.number_9));
        addCalculationToTextView();
        addAnswerToTextView();
    }

    public void onClickClearAll(View v){
        calculation.clearAll();
        addCalculationToTextView();
        addAnswerToTextView();
    }

    public void onClickBackspace(View v){
        calculation.backSpace();
        addCalculationToTextView();
        addAnswerToTextView();
    }

    public void onClickPercent(View v){
        if(!calculation.isEmpty() && calculation.noMathSymbolInTheEnd()){
            calculation.processPercent();
            calculation.calculate();
            addCalculationToTextView();
            addAnswerToTextView();
        }
    }

    public void onClickDivision(View v){
        if(calculation.isEmpty()){
            calculation.addNumber(getString(R.string.number_0));
        }
        if(calculation.noMathSymbolInTheEnd()){
            calculation.addMathSymbol(getString(R.string.iconDivision));
        } else {
            calculation.changeLastMathSymbol(getString(R.string.iconDivision));
        }

        addCalculationToTextView();
    }

    public void onClickAsterisk(View v){
        if(calculation.isEmpty()){
            calculation.addNumber(getString(R.string.number_0));
        }
        if(calculation.noMathSymbolInTheEnd()) {
            calculation.addMathSymbol(getString(R.string.iconAsterisk));
        } else {
            calculation.changeLastMathSymbol(getString(R.string.iconAsterisk));
        }
        addCalculationToTextView();
    }

    public void onClickMinus(View v){
        if(calculation.isEmpty()){
            calculation.addNumber(getString(R.string.number_0));
        }
        if(calculation.noMathSymbolInTheEnd()) {
            calculation.addMathSymbol(getString(R.string.iconMinus));
        } else {
            calculation.changeLastMathSymbol(getString(R.string.iconMinus));
        }
        addCalculationToTextView();
    }

    public void onClickPlus(View v){
        if(calculation.isEmpty()){
            calculation.addNumber(getString(R.string.number_0));
        }
        if(calculation.noMathSymbolInTheEnd()) {
            calculation.addMathSymbol(getString(R.string.iconPlus));
        } else {
            calculation.changeLastMathSymbol(getString(R.string.iconPlus));
        }
        addCalculationToTextView();
    }

    public void onClickDot(View v){
        if(calculation.isEmpty()){
            calculation.addNumber(getString(R.string.number_0));
        }
        if(!calculation.hasDotInFront()){
            calculation.addMathSymbol(getString(R.string.iconDot));
        }

        addCalculationToTextView();
    }

    public void onClickEquals(View v){
        addAnswerToTextView();
        saveHistoryOfCalculationInToFile();
    }


    private void addCalculationToTextView(){
        int latestIDTextCalculation = listIDTextView.get(listIDTextView.size() - 2);
        TextView textCalculation = findViewById(latestIDTextCalculation);
        textCalculation.setText(calculation.toString());

        setScrollViewBottom();
    }

    @SuppressLint("SetTextI18n")
    private void addAnswerToTextView(){
        int latestIDTextAnswer = listIDTextView.get(listIDTextView.size() - 1);
        TextView textAnswer = findViewById(latestIDTextAnswer);
        if(calculation.toString().isEmpty()){
            textAnswer.setText(getString(R.string.number_0));
        } else {
            calculation.calculate();
            textAnswer.setText(calculation.getAnswer());
        }
        setScrollViewBottom();
    }

    private void setScrollViewBottom(){
        ScrollView scroll = findViewById(R.id.scrollViewAnswer);
        scroll.fullScroll(ScrollView.FOCUS_DOWN);
    }

    public void onClickSetDarkMode(View view){
        ImageView imageView_DarkMode = findViewById(R.id.imageView_DarkMode);
        ImageView imageView_LightMode = findViewById(R.id.imageView_LightMode);

        imageView_DarkMode.setImageResource(R.drawable.ic_darkmode_light);
        imageView_LightMode.setImageResource(R.drawable.ic_lightmode_dark);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
    }

    public void onClickSetLightMode(View view){
        ImageView imageView_DarkMode = findViewById(R.id.imageView_DarkMode);
        ImageView imageView_LightMode = findViewById(R.id.imageView_LightMode);

        imageView_DarkMode.setImageResource(R.drawable.ic_darkmode_dark);
        imageView_LightMode.setImageResource(R.drawable.ic_lightmode_light);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }

    public void saveHistoryOfCalculationInToFile(){
        FileOutputStream fileHistory = null;
        try {
            fileHistory = openFileOutput("history.txt", MODE_PRIVATE);
            OutputStreamWriter output = new OutputStreamWriter(fileHistory);
            for(int ID : listIDTextView){
                TextView textView = findViewById(ID);
                output.write(textView.getText().toString());
            }
            output.flush();
            output.close();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if(fileHistory != null) {
                try {
                    fileHistory.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }



}