package com.Nahid.company;

public class Main {

    public static void main(String[] args) {
        int[] arr={1,3,8,7,5,2,20,19};
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}