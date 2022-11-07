package com.example.sqlitesample;

public class Person {
    private int ID;
    private String name;
    private int age;

    public Person(String name, int age){
        setName(name);
        setAge(age);
    }

    public Person(int ID, String name, int age){
        setID(ID);
        setName(name);
        setAge(age);
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
