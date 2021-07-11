package com.Nahid.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int total;
        Store show=new Store();
        Store e=new Store();
        Store ic=new Store();
        Store ch =new Store();


        e.productID=1;
        e.proName="egg";
        e.productPrice=35;
        ic.productID=2;
        ic.proName="ice-cream";
        ic.productPrice=40;
        ch.productID=3;
        ch.proName="chips";
        ch.productPrice=30;

        Store[] arr = {e,ic, ch};

        Store[] pro=new Store[3];
        for (int i=0;i<pro.length;i++) {
            pro[i]=new Store();
        }
        
        total =show.ShowProduct(arr);

        System.out.println("======================================");
        System.out.println("Total price "+ total);
    }
}
