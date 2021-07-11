package com.Nahid.company;

import java.util.Scanner;
public class Store {
    public int productID,productPrice;
    public String proName;

    Scanner option=new Scanner(System.in);
    public int ShowProduct(Store[] arr){
        int sum=0,o,i=0,count=1;
        int[] co=new int[3];
        String[] s=new String[3];
        do{
            showList(arr);
            System.out.print("Chose option ==> ");
            o=option.nextInt();
            switch (o){
                case 1:
                    sum+=arr[i].productPrice;
                    s[i]=arr[i].proName;
                    co[i]+=count;
                    break;
                case 2:
                    sum+=arr[i+1].productPrice;
                    s[i+1]=arr[i+1].proName;
                    co[i+1]+=count;
                    break;
                case 3:
                    sum+=arr[i+2].productPrice;
                    s[i+2]=arr[i+2].proName;
                    co[i+2]+=count;
                    break;
                case 0:
                    totalList(s,co);
                    break;
                default:
                    System.out.println("Product not found");
                    break;
            }

        }while (o!=0);
        return sum;

    }

    private void showList(Store[] arr) {
        System.out.println("======================================");
        System.out.println("    ID     |    Name    |   Price   ");
        System.out.println("======================================");
        for (Store store : arr) {
            System.out.println("\t" + store.productID + "\t\t|\t" + store.proName + "\t\t|\t " + store.productPrice);
        }
        System.out.println("======================================");
        System.out.println("Enter 0 to exit");
    }
    void totalList(String[] s, int[] co){
        System.out.println("======================================");
        System.out.println("    Name    |    Quantity");
        System.out.println("======================================");
        for (int i=0;i<s.length;i++) {
            System.out.println("\t" + s[i]+"\t\t|\t"+co[i]);
        }

    }
}
