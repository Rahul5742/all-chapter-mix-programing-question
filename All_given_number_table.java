import java.util.Scanner;
public class All_given_number_table{
    public static void main(String[] args) {
        System.out.println("All given number table :");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your table number =");
        int a=sc.nextInt();
        int b=1;
        while(b<=10) {
            int table = a * b;
            System.out.println(a +" * "+ b +" = "+ table);
            b++;
        }
    }
}

