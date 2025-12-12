import java.io.*;
import java.util.*;

public class Lab2 {
    public static void main(String[] args) {
        try {
            // Input file
            File inputFile = new File("Input.txt");
            Scanner sc = new Scanner(inputFile);

            // Output file
            PrintWriter out = new PrintWriter("Output.txt");

            // Scanner delimiter set for comma and spaces
            sc.useDelimiter("[, ]+");

            while (sc.hasNext()) {
                // Read the next integer
                int num = sc.nextInt();

                // Calculate digit sum
                int sum = digitSum(num);

                // Write result to file
                out.print(sum);

                // Add comma after each value
                if (sc.hasNext()) out.print(", ");
            }

            // Close files
            sc.close();
            out.close();

            System.out.println("Output.txt file created successfully.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Function to calculate digit sum
    private static int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
