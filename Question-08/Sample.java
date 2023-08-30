/*Write a program to receive a color code from the user (an Alphabet).

        The program should then print the color name, based on the color code given.

        The following are the color codes and their corresponding color names. R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.

        If color code provided by the user is not valid then print "Invalid Code".
*/

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take color code input from the user
        System.out.print("Enter a color code (R, B, G, O, Y, W): ");
        char colorCode = scanner.next().toUpperCase().charAt(0);

        // Check the color code and print the corresponding color name
        String colorName;
        switch (colorCode) {
            case 'R':
                colorName = "Red";
                break;
            case 'B':
                colorName = "Blue";
                break;
            case 'G':
                colorName = "Green";
                break;
            case 'O':
                colorName = "Orange";
                break;
            case 'Y':
                colorName = "Yellow";
                break;
            case 'W':
                colorName = "White";
                break;
            default:
                colorName = "Invalid Code";
        }

        System.out.println(colorCode + "->" + colorName);

        scanner.close();
    }
}
