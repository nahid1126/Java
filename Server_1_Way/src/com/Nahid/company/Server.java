package com.Nahid.company;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket ss=new ServerSocket(6666);
            Socket s=ss.accept();
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str=dis.readUTF();
            System.out.println("Msg :"+str);
            ss.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
