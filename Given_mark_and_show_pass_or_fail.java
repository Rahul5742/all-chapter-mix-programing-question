import java.util.Scanner;

public class Given_mark_and_show_pass_or_fail{

    public static void main(String[] args) {


        System.out.println("Given_mark_and_show_pass_or_fail:");

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter math mark :");

        float math=sc.nextFloat();

        System.out.print("Enter physics mark :");

        float physics=sc.nextFloat();

        System.out.print("Enter chemistery mark :");

        float chemistery=sc.nextFloat();

        float percentage=(math+physics+chemistery)/3.0f;

        System.out.println("This is your percentage ="+percentage+" %");

        if(percentage>=40 && math>=33 && physics>=33 && chemistery>=33 ) {

            System.out.println("             congrats you are pass");

        }else if(percentage>=40 || math<=33 || physics<=33 || chemistery<=33) {

            System.out.println("              Sorry you are fail");

        }if(math<=33) {

            System.out.println("math fail");

        } if(physics<=33) {

            System.out.println("physics fail");

        } if(chemistery<=33){

            System.out.println("chemistry fail");
        }

    }

}

