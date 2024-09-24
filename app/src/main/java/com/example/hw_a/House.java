// Author @Olivia Sendelbach, 10/21/24
package com.example.hw_a;

import android.graphics.Paint;
import android.view.SurfaceView;
import android.graphics.Canvas;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Color;


public class House extends SurfaceView {

    //Creates colors with paint to use for house and other attributes
    private Paint red;
    private Paint blue;
    private Paint green;
    private Paint pink;
    private Paint yellow;
    private Paint black;



    //Sets colors to the Hexcode
    public House(Context context,AttributeSet attrs)
    {
     super(context, attrs);
     //Allows image to be displayed
     setWillNotDraw(false);

        red = new Paint();
        red.setColor(0xFF580000);
        red.setStyle(Paint.Style.FILL);

        //sky
        blue = new Paint();
        blue.setColor(0xFF0096FF);
        blue.setStyle(Paint.Style.FILL);

        green = new Paint();
        green.setColor(0xFF4F7942);
        green.setStyle(Paint.Style.FILL);

        pink = new Paint();
        pink.setColor(0xFFB6C1);
        pink.setStyle(Paint.Style.FILL);


        yellow = new Paint();
        yellow.setColor(0xFFEA00);
        yellow.setStyle(Paint.Style.FILL);

        black = new Paint();
        black.setColor(0xFF000000);
        black.setStyle(Paint.Style.FILL);

        //sky
        setBackgroundColor(0xFF0096FF);



    }
    @Override
    //Draws house with all attributes listed, with coordinates (0,0) in the bottom right
    public void onDraw(Canvas c)
    {
        super.onDraw(c);


        //Draws the dimensions on the grass by setting coordinates of each side of the rectangle
        c.drawRect(1600, 2000, 0, 1600,green);
        //Draws the dimensions on the house by setting coordinates of each side of the rectangle
        c.drawRect(850,900,200,1700,black);
        //Draws the dimensions on the chimney by setting coordinates of each side of the rectangle
        c.drawRect(350,600,220,900,red);
        //window
        c.drawRect(500,500,50,50,yellow);
        //sky set as BackgroundColor

    }



}
