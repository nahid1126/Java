package com.Nahid.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DrawRainbow rainbow=new DrawRainbow();
        JFrame frame=new JFrame();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(rainbow);
        frame.setSize(500,250);
        frame.setVisible(true);
    }
}
