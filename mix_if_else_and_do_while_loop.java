import java.util.Scanner;
public class mix_if_else_and_do_while_loop{
    public static void main(String [] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("mix_if-else_and_do_while_loop");
        System.out.println("only 2-20 table write");
        System.out.print("Enter your talble number :");
        int a= sc.nextInt();
        int b=1;
        if(a<=20) {
            do {
                int c = b * a;
                System.out.println(a + " * " + b + " = " + c);
                b++;
            } while (b <= 10);
        }else{
            System.out.println("only 2-20 table write");
        }
    }
}
