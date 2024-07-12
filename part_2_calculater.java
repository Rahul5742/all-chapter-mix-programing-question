import java.util.Scanner;

public class part_2_calculater {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);

            System.out.println("1 -> +");
            System.out.println("2 -> -");
            System.out.println("3 -> *");
            System.out.println("4 -> /");
            System.out.println("5 -> %");
            System.out.println("6 -> any number of table");
            System.out.println("7 -> currency conversion (NPR to INR / INR to NPR)");
            System.out.print("Enter operator (1-7) = ");
            byte operator = sc.nextByte();

            if (operator >= 1 && operator <= 5) {
                System.out.print("Enter first number = ");
                float a = sc.nextFloat();
                System.out.print("Enter second number = ");
                float b = sc.nextFloat();

                switch (operator) {
                    case 1:
                        System.out.println("Result: " + (a + b));
                        break;
                    case 2:
                        System.out.println("Result: " + (a - b));
                        break;
                    case 3:
                        System.out.println("Result: " + (a * b));
                        break;
                    case 4:
                        if (b == 0) {
                            System.out.println("Invalid Division");
                        } else {
                            System.out.println("Result: " + (a / b));
                        }
                        break;
                    case 5:
                        if (b == 0) {
                            System.out.println("Invalid Division");
                        } else {
                            System.out.println("Result: " + (a % b));
                        }
                        break;
                }
            } else if (operator == 6) {
                System.out.print("Enter the number to generate the table for: ");
                int table = sc.nextInt();
                for (int t = 1; t <= 10; t++) {
                    int sum = table * t;
                    System.out.println(table + " * " + t + " = " + sum);
                }
            } else if (operator == 7) {
                System.out.println("1 -> NPR to INR");
                System.out.println("2 -> INR to NPR");
                byte c = sc.nextByte();

                switch (c) {
                    case 1:
                        System.out.print("Enter NPR = ");
                        float npr = sc.nextFloat();
                        float inrFromNpr = npr / 1.6f;
                        System.out.println("This is your INR = " + inrFromNpr);
                        break;
                    case 2:
                        System.out.print("Enter INR = ");
                        float inr = sc.nextFloat();
                        float nprFromInr = inr * 1.6f;
                        System.out.println("This is your NPR = " + nprFromInr);
                        break;
                    default:
                        System.out.println("Invalid choice for currency conversion");
                }
            } else {
                System.out.println("Invalid Operator");
            }
        }
    }

