package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
public class SentinelValue {

    public static void main(String[] args) {
        // write your code here
    double amount, temp, NewAmount = 0;
    double percent=12; // depreciation percent after every week
    int weeks=6;
     Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter initial Price");
        amount=scan.nextDouble();
        System.out.println("Enter week (The Program ends after 6 weeks)");
         weeks=scan.nextInt();

        temp=amount;


        NewAmount = ((100 - percent) * temp) / 100;
        
        System.out.println("Price after  " + weeks + " weeks is =D" + NewAmount);


       for (int i=0; i<weeks; i++);



    }


}
