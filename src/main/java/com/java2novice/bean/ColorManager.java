package com.java2novice.bean;
 
public class ColorManager {
 
    MyColor color;

    ColorManager(){
        System.out.println("ColorManager const");
    }

    public void printColor(){
        this.color.printColor();
    }
     
    /**
     * dependency injection through setter method
     * @param myColor
     */
    public void setMyColor(MyColor myColor){
        System.out.println("ColorManager.setMyColor");
        this.color = myColor;
    }
}