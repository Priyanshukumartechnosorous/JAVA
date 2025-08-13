package Basic;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        for(int num = 1; num<= 5; num +=1) {
            //System.out.println(num);
        }
         //print number from 1 to n
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int num = 1; num <= n; num++) {
            //System.out.println("hello world");
        }

        int num = 1;
        while (num <= 5) {
           // System.out.println(num);
            num +=1;            
        }

        // do while loop
        int number = 1;
        do {
            System.out.println(number);
            number++;
        } while(number<5);
    }
}
