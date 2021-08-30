package Nahid;
////Name: Nahid Hasan
////ID: 04170201126
////Mail: nahidnub1126@gmail.com
import java.io.Serializable;

public class Covid implements Serializable {
    String name, gender, vacc, hos;
    int age, NID;

    @Override
    public String toString() {
        return "||\t"+name + "\t" + age + "\t\t" + gender + "\t\t" + NID + "\t\t" + vacc + "\t\t" + hos+"\t  ||";
    }
}
