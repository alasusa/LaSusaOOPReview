/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Student extends  Human{
    //********* GPA VARIABLE
    private int GPA;


    //********** CONTRUCTOR WITH SUPER AND GPA PARAMETERS

    public Student(String name, short age) {
        super(name, age);
    }
    public Student(String name, short age, int GPANum) {
        super(name, age);
        GPA = GPANum;
    }


    //OVERRIDE ABSTRACT METHODS TO PROPERLY EXTEND
    @Override
    public String getAddress() {
        return null;
    }

    @Override
    public void setAddress(String address) {

    }


    //GETTERS AND SETTERS FOR GPA
    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    //TOSTRING METHOD

    @Override
    public String toString(){

        return  "The Student " + getName() + " is " + getAge() + " years old and has a GPA of " + getGPA();
    }
    // ToDo 1: Make this class a child of Human  //Done

    // ToDo 2: Fix the resulting errors  //Done

    // ToDo 3: Add a field for GPA and create a setter and a getter  //Done

    // ToDo 4: Add comments to your code  //Done
}
