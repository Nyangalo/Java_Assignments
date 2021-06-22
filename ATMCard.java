package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ATMCard {

    public static void main(String[] args) {
        // write your code here
        // ATM card block after 3 attempts

        double PIN;
        int counter=3;
        int attempt=3;
        int RecordedPIN= 4682; // stored pin for the card
        int i=0;
        Scanner scan=new Scanner(System.in);

        System.out.println("Please Enter your Card PIN");
        PIN= scan.nextDouble();

        if (PIN==RecordedPIN){
            System.out.println("Your PIN is correct");
        }

        while (PIN!=RecordedPIN && attempt !=0){

            System.out.println("Incorrect PIN "+ --attempt + " trail left");
            counter--;

            if (attempt !=0) {
                System.out.println("Please Enter your Card PIN");
                PIN = scan.nextDouble();

                if (PIN == RecordedPIN) {
                    System.out.println("Your PIN is correct");

                }
            }else {
                System.out.println("Your card is Blocked, contact bank official");
            }


        }



    }
}
