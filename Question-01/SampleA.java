/*A) Write a program to check if a given integer number is Positive, Negative,
or Zero.
*/


import java.util.Scanner;

public class SampleA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int num = sc.nextInt();
        if(num > 0){
            System.out.println("It is a Positive integer.");
        } else if (num < 0) {
            System.out.println("It is a negative integer.");

        }
        else{
            System.out.println("Given integer is zero.");
        }
    }
}
