package com.Nahid.company;

import javax.swing.*;
import java.awt.*;

public class DrawSmiley extends JPanel {
    public void paintComponent(Graphics g){

        //draw the face
        g.setColor(Color.yellow);
        g.fillOval(50,50,300,300);

        g.setColor(Color.BLACK);
        g.fillOval(80,80,240,240);

        g.setColor(Color.GREEN);
        g.fillOval(115,115,170,170);

        g.setColor(Color.DARK_GRAY);
        g.fillOval(145,145,110,110);

        g.setColor(Color.RED);
        g.fillOval(175,175,50,50);

    }
}
