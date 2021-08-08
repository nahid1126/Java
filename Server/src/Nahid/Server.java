package Nahid;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
	// write your code here
        try {
            ServerSocket ss=new ServerSocket(5555);
            Socket s=ss.accept();

            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            DataInputStream dis=new DataInputStream(s.getInputStream());

            //for message from user
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

            String str1=" ";
            String str2=" ";

            //for message printing
            while (!str1.equals("end")){
                str1=dis.readUTF();
                System.out.println("Client Typing: "+str1);
                System.out.print("Enter your Message: ");
                str2=br.readLine();
                dos.writeUTF(str2);
                dos.flush();
            }
            dis.close();
            s.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
