package com.Nahid.company;

import javax.swing.*;
import java.awt.*;

public class DrawSmiley extends JPanel {
    public void paintComponent(Graphics g){

        //draw the face
        g.setColor(Color.yellow);
        g.fillOval(10,10,200,200);

        //draw the eyes
        g.setColor(Color.black);
        g.fillOval(55,65,30,30);
        g.fillOval(135,65,30,30);

        g.fillOval(95,100,30,30);
        //draw the mouth
        g.fillOval(50,110,120,60);

        //touch up the mouth into a smile
        g.setColor(Color.yellow);
        g.fillRect(50,110,120,30);
        g.fillOval(50,120,120,40);
    }
}
