public class Area_of_triangle {

public static void main(String[] args) {
    System.out.println("Area of triangle ");
    double a=3,b=4,c=5,sum,s;                // not less s
    s=(a+b+c)/2;                               //s is less code is error
    sum=Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println(sum);

}
}