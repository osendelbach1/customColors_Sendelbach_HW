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
        red.setColor(0xFF8B0000);
        red.setStyle(Paint.Style.FILL);

        //sky
        blue = new Paint();
        blue.setColor(0xFF0096FF);
        blue.setStyle(Paint.Style.FILL);

        green = new Paint();
        green.setColor(0xFF50C878);
        green.setStyle(Paint.Style.FILL);

        pink = new Paint();
        pink.setColor(0xFFB6C1);
        pink.setStyle(Paint.Style.FILL);


        yellow = new Paint();
        yellow.setColor(0xFFEA00);
        yellow.setStyle(Paint.Style.FILL);

        black = new Paint();
        black.setColor(0xFF00000);
        black.setStyle(Paint.Style.FILL);

        //sky
        setBackgroundColor(0xFF0096FF);



    }
    @Override
    //Draws house with all attributes listed, with coordinates (0,0) in the bottom right
    public void onDraw(Canvas c)
    {
        super.onDraw(c);

        //base of house
        c.drawRect(250,250,150, 150, pink);
        //roof
        //c.fillPolygon(250,250,width,height,black);
        //grass
        c.drawRect(500, 150, 500, 150,green);
        //sun
        c.drawOval(500,500,50,50,yellow);
        //windows
        c.drawOval(250,200,20,35,yellow);
        c.drawOval(200,200, 20, 35, yellow);
        //door
        c.drawRect(175,200,30,50,black);
        //Chimney
        c.drawRect(220,250,10,20,red);
        //sky set as BackgroundColor
    }



}
