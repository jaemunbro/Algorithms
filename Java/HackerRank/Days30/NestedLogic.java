package HackerRank.Days30;

import java.util.Scanner;

/**
 * Day 26: Nested Logic
 *
 * Task
 Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:

 If the book is returned on or before the expected return date, no fine will be charged (i.e.: .
 If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, .
 If the book is returned after the expected return month but still within the same calendar year as the expected return date, the .
 If the book is returned after the calendar year in which it was expected, there is a fixed fine of .


 */
public class NestedLogic {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int returnedD = sc.nextInt();
        int returnedM = sc.nextInt();
        int returnedY = sc.nextInt();
        int expectedD = sc.nextInt();
        int expectedM = sc.nextInt();
        int expectedY = sc.nextInt();

        if (returnedY < expectedY) {
            System.out.println("0");
        }else if (returnedY == expectedY && returnedM < expectedM){
            System.out.println("0");
        }else if(returnedY > expectedY){
            System.out.println("10000");
        }else if(returnedM > expectedM){
            System.out.println((returnedM-expectedM)*500);
        }else if(returnedD > expectedD){
            System.out.println((returnedD-expectedD)*15);
        }else{
            System.out.println("0");
        }
    }
}
