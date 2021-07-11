package com.Nahid.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DrawSmiley panel=new DrawSmiley();
        JFrame frame=new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(420,450);
        frame.setVisible(true);
    }
}
