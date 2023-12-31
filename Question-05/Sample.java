/*Initialize a character variable in a program and

print 'Alphabhet' if the initialized value is an alphabhet,
print 'Digit' if the initialized value is a number, and
print 'Special Character', if the Initialized value is anything else.
*/

public class Sample {
    public static void main(String[] args) {
        char ch = 'G';

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}

//We can solve above problem in another way
/*public class Main {
    public static void main(String[] args) {
        char ch = '7';

        if (Character.isLetter(ch)) {
            System.out.println("Alphabet");
        } else if (Character.isDigit(ch)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
*/