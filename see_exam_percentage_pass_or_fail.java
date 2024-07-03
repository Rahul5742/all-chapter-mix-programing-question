import java.util.Scanner;
public class see_exam_percentage_pass_or_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Subject mark=");
        float a = sc.nextFloat();
        System.out.print("Enter Subject mark=");
        float b = sc.nextFloat();
        System.out.print("Enter Subject mark=");
        float c = sc.nextFloat();
        System.out.print("Enter Subject mark=");
        float d = sc.nextFloat();
        System.out.print("Enter Subject mark=");
        float e = sc.nextFloat();
        float sum = (a + b + c + d + e) / 500.0F * 100.0F;
        System.out.println("This is your percentage=" + sum + "%");
        if (sum >= 50.0F && a >= 30.0F && b >= 30.0F && c >= 30.0F && d >= 30.0F && e >= 30.0F) {
            System.out.println("pass");
        } else if (a < 30.0F) {
            System.out.println("a fail");
        }

        if (b < 30.0F) {
            System.out.println("b fail");
        }

        if (c < 30.0F) {
            System.out.println("c fail");
        }

        if (d < 30.0F) {
            System.out.println("d fail");
        }

        if (e < 30.0F) {
            System.out.println("e fail");
        } else {
            System.out.println("fail");
        }

    }
}
