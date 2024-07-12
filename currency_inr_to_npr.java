
import java.util.Scanner;
public class currency_inr_to_npr{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter 1 = ind to npr:");
        System.out.println("Enter 2 = npr to ind:");
        System.out.print("Enter your poption =");
        int a=sc.nextInt();
        switch(a){
            case 1:
                System.out.print("Enter inr =");
                int b=sc.nextInt();
                float sum=b*1.6f;
                System.out.println("npr ="+sum);
                break;
            case 2:
                System.out.print("Enter npr =");
                int c=sc.nextInt();
                float sum2=c/1.6f;
                System.out.println("inr ="+sum2);
                break;
            default:
                System.out.println("invalid number:");
                break;
        }


    }
}

