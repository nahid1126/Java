package Nahid;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(5555);
            Socket s= ss.accept();

            DataInputStream data = new DataInputStream(s.getInputStream());
            String str=data.readUTF();
            System.out.println("Message: "+str);

            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
