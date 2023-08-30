/*B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57.
lastDigit(7, 17) → true
lastDigit(6, 17) → false
lastDigit(3, 113) → true */

import java.util.Scanner;
public class SampleB {
    static void lastDigit(int x , int y){
        int lastDigit_of_x = x%10;
        int lastDigit_of_y = y%10;
        if(lastDigit_of_x == lastDigit_of_y){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        lastDigit(a,b);
    }

}
