package com.Nahid.company;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
	// write your code here

        try{
            Socket s=new Socket("localhost",6666);
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            dos.writeUTF("Hello");
            dos.flush();
            dos.close();
            s.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
