package DSA.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
    //     list.add(10);
    //      list.add(1);
    //       list.add(13);
    //        list.add(122);
    //         list.add(127);
    //          list.add(10);
    // System.out.println(list.contains(122));
    // list.set(0, 99);
    // list.remove(2);
    // System.out.println(list);

    //input
    for( int i =0; i<5; i++) {
        list.add(sc.nextInt());
    }
    //get item at any index
    for (int i=0; i<5;i++) {
        System.out.println(list.get(i));//pass index list[index] not working 
    }
    }
}
