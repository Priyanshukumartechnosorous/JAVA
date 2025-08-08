package DSA.Array;

import java.util.Scanner;

public class MultidimArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i=0; i<3; i++) {
            list.add(new Arraylist<>());
        }
        for (int i =0;i<3;i++) {
            for (int j=0;j<3;j++) {
                list.get(i).add(sc.nextInt());
            }
        }
    }
}
