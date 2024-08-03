package ansh;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A: ");
        int a = sc.nextInt();
        System.out.println("Enter the B: ");
        int b = sc.nextInt();
        System.out.println("Before swapping: a = " + a + " b = " + b);
        int [] swapped = swap(a, b);
        a = swapped[0];
        b = swapped[1];
        System.out.println("After swapping: a = " + a + " b = " + b);
    }
    static int[] swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        return new int[]{a, b};
    }
}
