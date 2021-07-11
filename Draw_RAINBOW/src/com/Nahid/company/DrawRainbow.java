package com.Nahid.company;

import javax.swing.*;
import java.awt.*;

public class DrawRainbow extends JPanel {
    //define indigo and violet
    private final static Color VIOLET=new Color(128,0,128);
    private final static Color INDIGO=new Color(75,0,130);

    //color to use in the rainbow starting from the innermost
    //the two while entries result in an empty arc in the center
    private final Color[] colors={Color.WHITE,Color.WHITE,VIOLET,INDIGO,Color.BLUE,Color.GREEN,Color.YELLOW,Color.ORANGE,Color.RED};

    //constructor
    public DrawRainbow(){
        //set background white
        setBackground(Color.WHITE);
    }

    //draw a rainbow using concentric arcs
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int radius=20; //radius of an arc
        //draw the rainbow near the bottom-center
        int centerX=getWidth()/2;
        int centerY=getHeight()-10;

        //draw filled arcs starting with the outermost
        for (int i=colors.length;i>0;i--){
            //set the color for the current arc
            g.setColor(colors[i-1]);

            //fill the arc from 0 to 180 deg
            g.fillArc(centerX-i*radius,centerY-i*radius,i*radius*2,i*radius*2,0,180);
        }
    }
}
