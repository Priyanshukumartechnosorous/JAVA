import java.util.Scanner;

public class exceptionDemo {
    public static void main(String[] args) {
        int a,b,c;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        try{
            c=a/b;
            System.out.println("Division is"+c);
        }
        catch(ArithmeticException e){
            System.out.println("denominator should not be zero");

        }
        System.out.println("bye");
    }
    
}
