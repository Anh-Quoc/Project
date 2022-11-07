package com.example.jokinghazard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private final int[] arrIDImage = {R.drawable.image_001, R.drawable.image_002, R.drawable.image_003,
            R.drawable.image_004, R.drawable.image_005, R.drawable.image_006, R.drawable.image_007,
            R.drawable.image_008, R.drawable.image_009};

    private ImageView imageView_01, imageView_02, imageView_03;

    private boolean image_01_IsClick;
    private boolean image_02_IsClick;
    private boolean image_03_IsClick;

    private ArrayList<Integer> imageIsPrint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView_01 = findViewById(R.id.imageView_01);
        imageView_02 = findViewById(R.id.imageView_02);
        imageView_03 = findViewById(R.id.imageView_03);

        imageIsPrint = new ArrayList<>();

        image_01_IsClick = false;
        image_02_IsClick = false;
        image_03_IsClick = false;

    }

    public void newRound(View view){
        imageView_01.setImageResource(R.drawable.black_card);
        imageView_02.setImageResource(R.drawable.black_card);
        imageView_03.setImageResource(R.drawable.black_card);

        image_01_IsClick = false;
        image_02_IsClick = false;
        image_03_IsClick = false;

        imageIsPrint.clear();
    }

    public void image_01_Click(View view){
        if(!image_01_IsClick) {
            int imageID = arrIDImage[getRandomIDImage()];
            while (!checkID(imageID)){
                imageID = arrIDImage[getRandomIDImage()];
            }
            imageIsPrint.add(imageID);
            image_01_IsClick = true;
            imageView_01.setImageResource(imageID);
        }
    }

    public void image_02_Click(View view){
        if(!image_02_IsClick) {
            int imageID = arrIDImage[getRandomIDImage()];
            while (!checkID(imageID)){
                imageID = arrIDImage[getRandomIDImage()];
            }
            imageIsPrint.add(imageID);
            image_02_IsClick = true;
            imageView_02.setImageResource(imageID);
        }
    }

    public void image_03_Click(View view){
        if(!image_03_IsClick) {
            int imageID = arrIDImage[getRandomIDImage()];
            while (!checkID(imageID)){
                imageID = arrIDImage[getRandomIDImage()];
            }
            imageIsPrint.add(imageID);
            image_03_IsClick = true;
            imageView_03.setImageResource(imageID);
        }
    }

    private boolean checkID(int IDRandom){
        for(int i = 0; i < imageIsPrint.size(); ++i){
            if(imageIsPrint.get(i) == IDRandom){
                return false;
            }
        }
        return true;
    }

    private int getRandomIDImage(){
        Random ran = new Random();
        return ran.nextInt(arrIDImage.length);
    }

}