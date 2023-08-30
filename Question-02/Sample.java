//Write a program to check if a given integer number is odd or even.

import java.util.Scanner;
public class Sample {
    public static void oddEven(int num){
        if(num%2==0){
            System.out.println( num+ " is an even number.");
        }else{
            System.out.println(num+ " is an odd number");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a Integer: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        oddEven(number);

    }
}
