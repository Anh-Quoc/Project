package com.example.sqlitesample;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    protected LinearLayout viewLayout;
    protected EditText inputName;
    protected EditText inputAge;
    protected Button submitButton;
    protected Button getDataButton;

    protected ArrayList<TextView> listTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewLayout = findViewById(R.id.viewLayout);
        inputName = findViewById(R.id.editTextName);
        inputAge = findViewById(R.id.editTextAge);
        submitButton = findViewById(R.id.submitButton);
        listTextView = new ArrayList<>();

        DatabaseHandler db = new DatabaseHandler(this);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                String name = inputName.getText().toString();
                String age = inputAge.getText().toString();

                Person newPerson = new Person(name, Integer.parseInt(age));
                db.addPerson(newPerson);
            }
        });
    }

    public void getDataOnclick(View v){
        DatabaseHandler db = new DatabaseHandler(this);
        List<Person> personList = new ArrayList<>(db.getAllPerson());
        listTextView.clear();
        for(Person person : personList){
            TextView textView = new TextView(MainActivity.this);
            textView.setText(person.getID() + " - " + person.getName() + " - " + person.getAge());
            listTextView.add(textView);
        }
        showData();
    }

    private void showData(){
        LinearLayout viewDataLayout = findViewById(R.id.viewData);
        viewDataLayout.removeAllViews();
        for(TextView textView : listTextView){
            viewDataLayout.addView(textView);
        }
    }

}