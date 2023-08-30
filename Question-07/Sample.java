/*Initialize a character variable with an alphabhet in a program.

If the character value is in lowercase, the output should be displayed in uppercase in the following format.

Example1)

i/p:a

o/p:a->A

If the character value is in uppercase, the output should be displayed in lowercase in the following format.

Example2)

i/p:A

o/p: A->a
*/

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take character input from the user
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        // Check if the character is lowercase
        if (Character.isLowerCase(character)) {
            // Convert lowercase character to uppercase
            char convertedCharacter = Character.toUpperCase(character);
            System.out.println(character + " -> " + convertedCharacter);
        } else if (Character.isUpperCase(character)) {
            // Convert uppercase character to lowercase
            char convertedCharacter = Character.toLowerCase(character);
            System.out.println(character + " -> " + convertedCharacter);
        } else {
            // Character is neither lowercase nor uppercase
            System.out.println("Invalid input!");
        }

        scanner.close();
    }
}
