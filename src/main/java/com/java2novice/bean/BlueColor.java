package com.java2novice.bean;
 
public class BlueColor implements MyColor {


    BlueColor(){
        System.out.println("BlueColor const");
    }

    @Override
    public void printColor() {
        System.out.println("It is blue in color...");
    }
}