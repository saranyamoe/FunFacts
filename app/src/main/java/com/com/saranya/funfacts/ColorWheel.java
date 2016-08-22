package com.com.saranya.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by saranya on 11/7/2015.
 */
//constuctor
public class ColorWheel {
    //property name's mColors
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };
    //getColor() is a method in this ColorWheel class
    public int getColor(){

        //the button was clicked,so update the lable with the new color

        //randomly select random color;
        String color;
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);

        color = mColors[randomNumber];//this is string color
        int colorAsInt = Color.parseColor(color); //pass in string color turn to int datatype
        return colorAsInt;
    }
}
