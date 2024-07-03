import java.util.Scanner;

public class easy_code_for_making_tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your table number: ");
        int a = sc.nextInt();

        // Validate input (optional)
        if (a < 1 || a > 20) {
            System.out.println("Please enter a number between 1 and 20.");
            return; // Exit the program if input is out of range
        }

        // Print the multiplication table for the given number
        for (int i = 1; i <= 10; i++) {
            int result = a * i;
            System.out.println(a + " * " + i + " = " + result);
        }
    }
}

