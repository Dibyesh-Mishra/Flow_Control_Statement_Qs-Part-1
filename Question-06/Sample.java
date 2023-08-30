/*Write a program to accept gender ("Male" or "Female") and age from command line arguments and print the percentage of interest based on the given conditions.

If the gender is 'Female' and age is between 1 and 58, the percentage of interest is 8.2%.

If the gender is 'Female' and age is between 59 and 100, the percentage of interest is 9.2%.

If the gender is 'Male' and age is between 1 and 58, the percentage of interest is 8.4%.

If the gender is 'Male' and age is between 59 and 100, the percentage of interest is 10.5%.
*/

public class Sample {
    public static void main(String[] args) {
        // Check if the correct number of command line arguments are provided
        if (args.length != 2) {
            System.out.println("Usage: java InterestCalc <gender> <age>");
            System.exit(1);
        }

        // Read gender and age from command line arguments
        String gender = args[0];
        int age = Integer.parseInt(args[1]);

        // Calculate the percentage of interest based on gender and age
        double percentageOfInterest;
        if (gender.equalsIgnoreCase("Female")) {
            if (age >= 1 && age <= 58) {
                percentageOfInterest = 8.2;
            } else if (age >= 59 && age <= 100) {
                percentageOfInterest = 9.2;
            } else {
                System.out.println("Invalid age for Female");
                System.exit(1);
                return;
            }
        } else if (gender.equalsIgnoreCase("Male")) {
            if (age >= 1 && age <= 58) {
                percentageOfInterest = 8.4;
            } else if (age >= 59 && age <= 100) {
                percentageOfInterest = 10.5;
            } else {
                System.out.println("Invalid age for Male");
                System.exit(1);
                return;
            }
        } else {
            System.out.println("Invalid gender");
            System.exit(1);
            return;
        }

        // Print the calculated percentage of interest
        System.out.printf("Percentage of Interest: %.1f%%\n", percentageOfInterest);
    }
}

