package ninth;

import java.util.Scanner;

public class Countnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number more than 100: ");
        int n = in.nextInt();
        System.out.print("Enter a number to count: ");
        int s = in.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if(rem == s){
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
