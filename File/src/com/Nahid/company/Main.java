package com.Nahid.company;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StringBuilder string=new StringBuilder("");
        try{
            FileInputStream file=new FileInputStream("F:\\Java\\File\\src\\com\\Nahid\\company\\test.txt");

            BufferedInputStream buffere=new BufferedInputStream(file);

            int i;
            while ((i=buffere.read())!=-1){
                //System.out.println((char)i);
                string.append((char)i);
            }
            buffere.close();
            file.close();
    }catch (Exception e){
            System.out.println(e);}

        //System.out.println(string);
        String str=string.toString();
        String s=str.toUpperCase();

        //System.out.println(s);

        try{
            FileOutputStream outputStream=new FileOutputStream("F:\\Java\\File\\src\\com\\Nahid\\company\\test1.txt");
            byte[] b=s.getBytes();
            outputStream.write(b);

            outputStream.close();
        }catch (Exception e){

        }
        System.out.println(s);

        String str1 = "";
        System.out.println("Write for new file");
        try {
            FileOutputStream os=new FileOutputStream("F:\\Java\\File\\src\\com\\Nahid\\company\\test2.txt");
            Scanner in=new Scanner(System.in);

            str1=in.nextLine();
            byte[]B=str1.getBytes();
            os.write(B);
        }catch (Exception e){

        }
        System.out.println(str1);

    }

}
