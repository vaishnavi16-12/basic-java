package com.bridgelabz.loopingprogram;

import java.util.Scanner;

public class NumberDisplay {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int number= sc.nextInt();

        if(number==1){
            System.out.println("Unit");
        } else if (number==10) {
            System.out.println("Ten");
        } else if (number==100) {
            System.out.println("Hundred");
        } else if (number==1000) {
            System.out.println("Thousand");
        } else if (number==10000) {
            System.out.println(" Ten Thousand");

        } else {
            System.out.println("Invalid Number");

        }
    }
}
