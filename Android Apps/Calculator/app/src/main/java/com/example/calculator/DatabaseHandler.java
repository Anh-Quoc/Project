package com.example.calculator;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler extends SQLiteOpenHelper{
    private static final String DATABASE_NAME = "Calculation_Manager";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "calculation_Table";
    private static final String KEY_ID = "id";
    private static final String KEY_Calculation = "calculation";
    private static final String KEY_Result = "result";

    public DatabaseHandler(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create_calculation_table = String.format("CREATE TABLE %s(%s INTEGER PRIMARY KEY, %s TEXT, %s TEXT)", TABLE_NAME, KEY_ID, KEY_Calculation, KEY_Result);
        sqLiteDatabase.execSQL(create_calculation_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String drop_calculation_table = String.format("DROP TABLE IF EXISTS %s", TABLE_NAME);
        sqLiteDatabase.execSQL(drop_calculation_table);
        onCreate(sqLiteDatabase);
    }

    public void addCalculation(Calculation calculation){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_Calculation, calculation.getString_Calculation());
        values.put(KEY_Result, calculation.getAnswer());
        try {
            db.insert(TABLE_NAME, null, values);
            db.close();
        } catch (SQLException e){
            db.close();
        }

    }



    public void deleteDatabase(){

    }

    public ArrayList<Calculation> getAllCalculation(){
        ArrayList<Calculation> listCalculation = new ArrayList<>();
        String query = "SELECT" + " * " + "FROM " + TABLE_NAME;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        cursor.moveToFirst();

        while (!cursor.isAfterLast()){
            Calculation calculation = new Calculation(cursor.getInt(0), cursor.getString(1), cursor.getString(2));
            listCalculation.add(calculation);
            cursor.moveToNext();
        }

        return listCalculation;
    }


}
