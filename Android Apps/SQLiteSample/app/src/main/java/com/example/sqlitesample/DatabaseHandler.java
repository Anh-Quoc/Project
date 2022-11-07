package com.example.sqlitesample;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "PeopleManager";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "people";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_AGE = "age";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String create_person_table = String.format("CREATE TABLE %s(%s INTEGER PRIMARY KEY, %s TEXT, %s TEXT)", TABLE_NAME, KEY_ID, KEY_NAME, KEY_AGE);
        sqLiteDatabase.execSQL(create_person_table);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        String drop_person_table = String.format("DROP TABLE IF EXISTS %s", TABLE_NAME);
        sqLiteDatabase.execSQL(drop_person_table);

        onCreate(sqLiteDatabase);
    }

    public void addPerson(Person person){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME, person.getName());
        values.put(KEY_AGE, person.getAge());

        db.insert(TABLE_NAME, null, values);
        db.close();
    }

    public Person getPerson(int personID){
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.query(TABLE_NAME, null, KEY_ID + " = ?", new String[] {String.valueOf(personID)}, null, null, null);
        if(cursor != null){
            cursor.moveToFirst();
        }

        Person person = new Person(cursor.getInt(0), cursor.getString(1), cursor.getInt(2));
        return person;
    }

    public List<Person> getAllPerson(){
        List<Person> personList = new ArrayList<>();
        String query = "SELECT" + " * " + "FROM " + TABLE_NAME;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        cursor.moveToFirst();

        while (!cursor.isAfterLast()){
            Person person = new Person(cursor.getInt(0), cursor.getString(1), cursor.getInt(2));
            personList.add(person);
            cursor.moveToNext();
        }

        return personList;
    }

}
