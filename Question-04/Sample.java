/*Initialize two character variables in a program and display the characters in alphabetical order.

Example1) if the first character is 's' and second character is 'e' then the output should be e,s

Example2) if the first character is 'a' and second character is 'e', then the output should be a,e
*/

public class Sample {
    public static void main(String[] args) {
        char char1 = 's';
        char char2 = 'e';

        if (char1 > char2) {
            System.out.println(char2 + "," + char1);
        } else {
            System.out.println(char1 + "," + char2);
        }
    }
}
