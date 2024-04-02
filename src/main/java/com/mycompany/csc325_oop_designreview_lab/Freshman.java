package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student {
    public Freshman(String name, short age, int GPANum) {
        super(name, age, GPANum);
    }


    //OVERRIDE THE TOSTRING METHOD
    @Override
    public String toString(){

        return "The Freshman " + getName() + " is " + getAge() + " years old and has a GPA of " + getGPA();
    }
}
