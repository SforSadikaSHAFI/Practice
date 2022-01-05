package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PracticeMethods {

//Write a Java program that takes five numbers as input to calculate and print the average of the numbers.

    public PracticeMethods() {

    }

    public void findAvg() {
        double a, b, c, d, e, avg, sum;

        Scanner input = new Scanner(System.in);
        //double number ;
        System.out.print("Enter 1st number :");
        a = input.nextDouble();
        System.out.print("Enter 2nd number :");
        b = input.nextDouble();
        System.out.print("Enter 3rd number :");
        c = input.nextDouble();
        System.out.print("Enter 4th number :");
        d = input.nextDouble();
        System.out.print("Enter 5th number :");
        e = input.nextDouble();

        sum = a + b + c + d + e;
        avg = sum / 5;
        System.out.println("Average of 5 numbers: " + avg);


    }

    //Write a Java program to swap two variables
    public void swap() {
        int a, b, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        a = input.nextInt();
        System.out.print("Enter 2nd number :");
        b = input.nextInt();
        System.out.println();
        System.out.println("***Before Swapping***");
        System.out.println("a = " + a + " b= " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println();
        System.out.println("***After Swapping***");
        System.out.println("a = " + a + " b = " + b);
    }

    //    Write 2 methods  to print the odd and even  numbers from 1 to n
    public void findOddEven() {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number :");
        n = input.nextInt();
        System.out.println();
        oddNum(n);
        System.out.println();
        evenNum(n);
    }


    public void oddNum(int n) {
        System.out.print("Odd numbers are :");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }

        }
    }

    public void evenNum(int n) {
        System.out.print("Even numbers are :");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }
    }
    //Write a Java program to check if a positive number is a palindrome or not

    public void checkPalindrome() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int input = in.nextInt();
        int number = input;
        int remainder, reverse = 0;
        //checking weather the number is positive or not
        if (number > 0) {
            while (number != 0) {
                remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;

                //number++;
            }
            //System.out.println("Reverse :"+reverse);
            if (input == reverse) {
                System.out.println(" It is a palindrome number.");
            } else {
                System.out.println(" Not a palindrome number.");
            }

        }
        else System.out.println("Enter a positive number!!!");
    }
}
