package DSA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    //     int[] arr = new int[5];
    //     arr[0]= 1;
    //     arr[1]= 12;
    //     arr[2]= 144;
    //     arr[3]= 153;
    //     arr[4]= 10;
    //     System.out.println(arr[3]);

    //     for (int i =0; i< arr.length;i++) {
    //         arr[i] = sc.nextInt();
    //     }
    //      for (int i =0; i< arr.length;i++) {
    //         System.out.print(arr[i]); 
    //     }
    //     for( int nums : arr) {
    //         System.out.println(nums);// here nums represents element of the array

    //     }
    //     System.out.println(Arrays.toString(arr));

    // array of objects
    String[] str = new String[4];
    for (int i =0; i<str.length;i++) {
        str[i] = sc.next();
    }
    System.out.println(Arrays.toString(str));

     }
}
