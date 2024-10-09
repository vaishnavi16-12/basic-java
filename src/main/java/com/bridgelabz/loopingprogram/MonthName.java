package com.bridgelabz.loopingprogram;

import java.util.Scanner;

public class MonthName {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter month name: ");
        int monthNumber= sc.nextInt();
         switch (monthNumber){
             case 1:
                 System.out.println("january");
                 break;
             case 2:
                 System.out.println("February");
                 break;
             case 3:
                 System.out.println("March");
                 break;
             case 4 :
                 System.out.println("April");
                 break;
             case 5:
                   System.out.println("May");
                 break;
                 case 6:
                 System.out.println("june");
                 break;
                case 7 :
                 System.out.println("july");
                 break;
             case 8 :
                 System.out.println("August");
             case 9:
                 System.out.println("September");
             case 10 :
                 System.out.println("October");
             case 11:
                 System.out.println("November");
                 break;
             case 12 :
                 System.out.println("December");
                 break;
             default:
                 System.out.println("Invalid Input");
         }
    }
}
