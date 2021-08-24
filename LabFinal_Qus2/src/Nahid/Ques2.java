package Nahid;

///Name: Nahid Hasan
///ID:04170201126
///mail:bahidnub1126@gmail.com
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ques2 {

    public static void main(String[] args) {
        // write your code here
        StringBuilder string = new StringBuilder("");
        try {
            FileInputStream file = new FileInputStream("F:\\Java\\LabFinal_Qus2\\src\\Nahid\\Nahid.txt");

            //input form file
            BufferedInputStream buffere = new BufferedInputStream(file);

            int i;
            while ((i = buffere.read()) != -1) {
                string.append((char) i);
            }
            buffere.close();
            file.close();
        } catch (Exception e) {
            System.out.println(e);
        }


        String str1 = string.toString();



        try {
            String str2 = " Nahid Hasan 1126";
            FileOutputStream outputStream = new FileOutputStream("F:\\Java\\LabFinal_Qus2\\src\\Nahid\\Nahid2.txt");
            byte[] b = str1.getBytes();
            byte[] b2=str2.getBytes();
            outputStream.write(b);
            outputStream.write(b2);
            outputStream.close();
        } catch (Exception e) {

        }

        try{
            FileInputStream file = new FileInputStream("F:\\Java\\LabFinal_Qus2\\src\\Nahid\\Nahid2.txt");

            //input form file
            BufferedInputStream buffere2 = new BufferedInputStream(file);

            int i;
            while ((i = buffere2.read()) != -1) {
                System.out.print((char) i);
            }
            buffere2.close();
            file.close();

        }catch (Exception e){
            System.out.println(e);
        }

    }
}
