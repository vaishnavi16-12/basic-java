package com.bridgelabz.loopingprogram;

import java.util.Scanner;

public class SwitchVowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Vowels : ");
        char ch= sc.next().toLowerCase().charAt(0);
        switch (ch){
            case 'a':
            case 'e' :
            case 'i':
            case 'o' :
            case 'u':
                System.out.println(ch+ " is a vowel");
                 break;
            default:
                System.out.println(ch+ "is not a vowel");

        }

    }
}
