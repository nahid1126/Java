package Nahid;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
	// write your code here
        try {
            Socket s = new Socket("localhost", 5555);
            DataInputStream dis=new DataInputStream(s.getInputStream());
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());

            //for input from user
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            String str1=" ";
            String str2=" ";

            //for write and read
            while (!str1.equals("end")){
                System.out.print("Enter Your Message: ");
                str1=br.readLine();
                dos.writeUTF(str1);
                dos.flush();

                //for server message print
                str2=dis.readUTF();
                System.out.println("Server Typing: "+str2);
            }
            dos.close();
            s.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
