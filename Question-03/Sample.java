/*Write a program to check if the program has received command line arguments or not.
If the program has not received arguments then print "No Values", else print all the values in a single line separated by, (comma)

Example1) java Example
 O/P: No values
Example2) java Example Mumbai Bangalore O/P: Mumbai, Bangalore
[Hint: You can use length property of an array to check its length]
*/
public class Sample {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No values");
        } else {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < args.length; i++) {
                result.append(args[i]);
                if (i != args.length - 1) {
                    result.append(" , ");
                }
            }
            System.out.println(result);
        }
    }
}
