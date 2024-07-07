//import java.util.Scanner;
//public class b{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter your name = ");
//        String name=sc.next();
//        System.out.println(name.length());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.trim());
//        System.out.println(name.substring(2));
//        System.out.println(name.substring(2,4));
//        System.out.println(name.startsWith("r",2));
//        System.out.println(name.endsWith("l"));
//        System.out.println(name.charAt('R'));
//        System.out.println(name.replace('R','a'));
//        System.out.println(name.replace("r","Anjali"));
//        System.out.println(name.equals('r'));
//        System.out.println(name.equals("rahul"));
//        System.out.println(name.isEmpty());
//        System.out.println(name.equalsIgnoreCase("rahul"));
//        System.out.println(name.indexOf('u',0,4));
//        System.out.println(name.lastIndexOf('R',5));
//        System.out.println(name.indexOf('h'));
//
//    }
//}





//import java.util.Scanner;
//public class a{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.println("hello");
//            }
//        }
//    }
//}


//import java.util.Scanner;
//public class a{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int m=sc.nextInt();
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.println("hello");
//            }
//        }
//    }
//}







//name2 is only use empty method:
//
// length of string:
//
//all char convert captel letter:
//
// all char convert small letter:
//
//Starting whitespace are remove:
//
// replace method in this case small ('r') is not apper than print same string: using ('_') single cot always optain char:
//
//replace method in this case captel ('R') is apper than print another string: ('R') replace with ('A'):
//
// replace method in this case ("Ra") replace with "Anjali": using "_" dobble cot always optain word:
//
//charAt(3) Returns the character at a given index position: in this case 3 = 'u': start counting alwalys 0:
//
// substring(int start) Returns a substring from start to the end. Substring (3) returns "ahul".[Note that indexing starts from 0]:
//
//substring(int start, int end) Returns a substring from the start index to the end index. The start index is included, and the end is excluded. Substring (1,3) returns "ah" :
//
// startsWith ("Ra") Returns true if the name starts with the string "Ra". (True in this case): boolean value return:
//
//startsWith ("h",3) Returns false if the name starts with the string ("h",3): (false in this case): boolean value return: [Case sensitive]:
//
//startsWith ("h",2) Returns true if the name starts with the string ("h",2): (true in this case): boolean value return: [Case sensitive]:
//
// endsWith ("ul") Returns true if the name ends with the string "ul". (True in this case):
//
// indexOf ('u') Returns the index of the first occurrence of the specified character in the given string:
//
// indexOf ('h',1,4) Returns the index of the first occurrence of the specified character in the given string:
//
// lastindexOf ('l') Returns the last index of the specified character from the given string.(4 in this case)
//
// lastindexOf ('u',4) Returns the last index of the specified character from the given string.(3 in this case)
//
// equals ("Rahul") Returns true if the given string is equal to "Rahul" false otherwise: [Case sensitive]:
//
// equals ("Rahul")Returns true if the given string is equal to "rahul" in this case false: [Case sensitive]:
//
//equalsignoreCase ("rahul") Returns true if two strings are equal, ignoring the case of characters:
//
//isEmpty ()  string are empty than  Returns true :








//public class a{
//    public static void main(String[] args) {
//
//        String name="Rahul";
//        String name2=" ";                                                                                                  // they only use empty method:
//
//        System.out.println("String of length method = "+name.length());                                                    // length of string:
//
//        System.out.println("String of toUpperCase method = "+name.toUpperCase());                                          // all char convert captel letter:
//
//        System.out.println("String of toLowerCase method = "+name.toLowerCase());                                          // all char convert small letter:
//
//        System.out.println("String of trim method = "+name.trim());                                                        // Starting whitespace are remove:
//
//        System.out.println("String of replace method = "+name.replace('r','a'));                          // replace method in this case small ('r') is not apper than print same string: using ('_') single cot always optain char:
//
//        System.out.println("String of replace method  print 1 char '_' = "+name.replace('R','A'));        // replace method in this case captel ('R') is apper than print another string: ('R') replace with ('A'):
//
//        System.out.println("String of replace method print word = "+name.replace("Ra","Anjali"));        // replace method in this case ("Ra") replace with "Anjali": using "_" dobble cot always optain word:
//
//        System.out.println("String of charAt method = "+name.charAt(3));                                                   // charAt(3) Returns the character at a given index position: in this case 3 = 'u': start counting alwalys 0:
//
//        System.out.println("String of substring method (int) = "+name.substring(1));                             // substring(int start) Returns a substring from start to the end. Substring (3) returns "ahul".[Note that indexing starts from 0]:
//
//        System.out.println("String of substring method (int,int) = "+name.substring(1,3));                                 // substring(int start, int end) Returns a substring from the start index to the end index. The start index is included, and the end is excluded. Substring (1,3) returns "ah" :
//
//        System.out.println("String of startWith method = "+name.startsWith("Ra"));                                         // startsWith ("Ra") Returns true if the name starts with the string "Ra". (True in this case): boolean value return:
//
//        System.out.println("String of startWith method (String,int) = "+name.startsWith("h",3));              // startsWith ("h",3) Returns false if the name starts with the string ("h",3): (false in this case): boolean value return: [Case sensitive]:
//
//        System.out.println("String of startWith method (String,int) = "+name.startsWith("h",2));              // startsWith ("h",2) Returns true if the name starts with the string ("h",2): (true in this case): boolean value return: [Case sensitive]:
//
//        System.out.println("String of endWith method = "+name.endsWith("ul"));                                             // endsWith ("ul") Returns true if the name ends with the string "ul". (True in this case):
//
//        System.out.println("String of indexOf method = "+name.indexOf('u'));                                               // indexOf ('u') Returns the index of the first occurrence of the specified character in the given string:
//
//        System.out.println("String of indexOf method = "+name.indexOf('h',1,4));                    // indexOf ('h',1,4) Returns the index of the first occurrence of the specified character in the given string:
//
//        System.out.println("String of lastIndexOf method = "+name.lastIndexOf('l'));                                   // lastindexOf ('l') Returns the last index of the specified character from the given string.(4 in this case)
//
//        System.out.println("String of lastIndexOf method = "+name.lastIndexOf('u',4));                        // lastindexOf ('u',4) Returns the last index of the specified character from the given string.(3 in this case)
//
//        System.out.println("String of equal method = "+name.equals("Rahul"));                                              // equals ("Rahul") Returns true if the given string is equal to "Rahul" false otherwise: [Case sensitive]:
//
//        System.out.println("String of equal method = "+name.equals("rahul"));                                              // equals ("Rahul")Returns true if the given string is equal to "rahul" in this case false: [Case sensitive]:
//
//        System.out.println("String of equalsIgnoreCase method = "+name.equalsIgnoreCase("rahul"));             // equalsignoreCase ("rahul") Returns true if two strings are equal, ignoring the case of characters:
//
//        System.out.println("String of isEmpty = "+name2.isEmpty());                                                        // isEmpty ()  string are empty than  Returns true :
//    }
//}
//
//
//
//










//import java.util.Scanner;
//public class a{
//    public static void main(String[] args) {
//        System.out.println( "input method :");
//        Scanner sc=new Scanner (System.in);
//        System.out.print("Enter math mark =");
//        float a=sc.nextFloat();
//        System.out.print("Enter chemistry mark =");
//        float b=sc.nextFloat();
//        System.out.print("Enter physics mark =");
//        float c=sc.nextFloat();
//        System.out.print("Enter nepali mark =");
//        float d=sc.nextFloat();
//        System.out.print("Enter computer mark =");
//        float e=sc.nextFloat();
//        float sum=(a+b+c+d+e)/500*100;
//        System.out.println("this is your percentaage ="+sum+"%");
//
//
//    }
//}






//public class a{
//    public static void main(String[] args) {
//        System.out.println("add 3 number:");
//        int a=2,b=3,c=5;
//        int sum=a+b+c;
//        System.out.println("this is your 3 number sum ="+sum);
//    }
//}








//import java.util.Scanner;
//public class a{
//    public static void main(String[] args) {
//        System.out.println("addig 3 number:");
//        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter first number =");
//        float a=sc.nextFloat();
//        System.out.print("Enter second number =");
//        float b=sc.nextFloat();
//        System.out.print("Enter third number =");
//        float c=sc.nextFloat();
//        float sum=a+b+c;
//        System.out.println("This is your sum ="+sum);
//
//    }
//}



//import java.util.Scanner;
//public class a{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("cgpa out of 100:");
//        System.out.print("Enter first subject  mark =");
//        float a=sc.nextFloat();
//        System.out.print("Enter second subject  mark =");
//        float b=sc.nextFloat();
//        System.out.print("Enter third subject  mark =");
//        float c=sc.nextFloat();
//        float sum=(a+b+c)/30;
//        System.out.println("This your cgpa percentage = "+sum);
//
//    }
//}









//import java.util.Scanner;
//public class a{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("input your name and gritting:");
//        System.out.print("Enter your name =");
//        String name=sc.next();
//        System.out.println("Hello, "+name+" have a nice day");
//    }
//
//}




//import java.util.Scanner;
//public class a{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner (System.in);
//        System.out.println("cruncy ind to npr:");
//        System.out.print("Enter inr =");
//        int a=sc.nextInt();
//        float sum=a*1.6f;
//        System.out.println("this is your npr ="+sum);
//
//    }
//}




//import java.util.Scanner;
//public class a{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner (System.in);
//        System.out.println("cruncy npr to ind:");
//        System.out.print("Enter npr =");
//        int a=sc.nextInt();
//        float sum=a/1.60f;
//        System.out.println("this is your inr ="+sum);
//
//    }
//}




//import java.util.Scanner;
//public class a{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner (System.in);
//        System.out.println("Enter 1 = ind to npr:");
//        System.out.println("Enter 2 = npr to ind:");
//        System.out.print("Enter your poption =");
//        int a=sc.nextInt();
//        switch(a){
//            case 1:
//                System.out.print("Enter inr =");
//                int b=sc.nextInt();
//                float sum=b*1.6f;
//                System.out.println("npr ="+sum);
//                break;
//            case 2:
//                System.out.print("Enter npr =");
//                int c=sc.nextInt();
//                float sum2=c/1.6f;
//                System.out.println("inr ="+sum2);
//                break;
//            default:
//                System.out.println("invalid number:");
//                break;
//        }
//
//
//    }
//}

