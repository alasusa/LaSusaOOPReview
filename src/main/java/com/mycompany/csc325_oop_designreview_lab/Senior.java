package com.mycompany.csc325_oop_designreview_lab;

public class Senior extends Student {
    public Senior(String name, short age, int GPANum) {
        super(name, age, GPANum);
        if (GPANum <85){
            setGPA(85);
        }
    }


    //OVERRIDE THE TOSTRING METHOD
    @Override
    public String toString(){

        return  "The Senior " + getName() + " is " + getAge() + " years old and has a GPA of " + getGPA();
    }
}

