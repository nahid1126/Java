package Nahid;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        StringBuilder string = new StringBuilder(" ");
        //use file default
//        try{
//            FileInputStream file = new FileInputStream("F:\\Java\\One_Way_Server_from_File\\src\\Nahid\\test.txt");
//            BufferedInputStream buffer=new BufferedInputStream(file);
//            int i;
//            while ((i =buffer.read())!=-1){
//                string.append((char)i);
//            }
//            buffer.close();
//            file.close();
//        }catch (Exception e){
//            System.out.println(e);
//        }
//        String str1=string.toString();


        ///input from user for file
        String str1 = "";
        System.out.println("Write for new file");
        try {
            FileOutputStream os=new FileOutputStream("F:\\Java\\One_Way_Server_from_File\\src\\Nahid\\test2.txt");
            Scanner in=new Scanner(System.in);

            str1=in.nextLine();
            byte[]B=str1.getBytes();
            os.write(B);
        }catch (Exception e){

        }

        try {
            Socket socket=new Socket("localhost",5555);
            DataOutputStream data=new DataOutputStream(socket.getOutputStream());
            data.writeUTF(str1);
            data.flush();
            data.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
