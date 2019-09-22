package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the value of  principal");
        System.out.println("Enter the value of time");
        System.out.println("Enter the value of rate");

        Scanner obj = new Scanner(System.in);
        int principal = obj.nextInt();
        int time = obj.nextInt();
        int rate = obj.nextInt();

        double interest = (principal*time*rate)/100;

        System.out.println("The intersest value is:"+interest);


    }
}
