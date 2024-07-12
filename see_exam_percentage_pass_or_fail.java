import java.util.Scanner;
public class see_exam_percentage_pass_or_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter English mark=");
        float a = sc.nextFloat();
        System.out.print("Enter math mark=");
        float b = sc.nextFloat();
        System.out.print("Enter chemistry mark=");
        float c = sc.nextFloat();
        System.out.print("Enter physics mark=");
        float d = sc.nextFloat();
        System.out.print("Enter coumpter mark=");
        float e = sc.nextFloat();
        float sum = (a + b + c + d + e) / 500.0F * 100.0F;
        System.out.println("This is your percentage=" + sum + " %");
        if (sum >= 50.0F && a >= 30.0F && b >= 30.0F && c >= 30.0F && d >= 30.0F && e >= 30.0F) {
            System.out.println("             you are pass");
        } else if(sum <= 50.0F || a <= 30.0F || b <= 30.0F || c <= 30.0F || d <= 30.0F || e <= 30.0F) {
            System.out.println("             you are fail");
        }if (a < 30.0F) {
            System.out.println("English fail");
        }

        if (b < 30.0F) {
            System.out.println("math fail");
        }

        if (c < 30.0F) {
            System.out.println("chemistry fail");
        }

        if (d < 30.0F) {
            System.out.println("physics fail");
        }

        if (e < 30.0F) {
            System.out.println("coumpter fail");

        }

    }
}
