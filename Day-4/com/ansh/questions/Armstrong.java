package ansh.questions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isArmstrong(n));
        ListArm();
    }

    static boolean isArmstrong(int n) {
        int og = n;
        int sum = 0;
        int digitCount = String.valueOf(n).length();

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + (int) Math.pow(rem, digitCount);
        }
        return sum == og;
    }

    static void ListArm() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num to find Armstrong for 100 to: ");
        int n = in.nextInt();
        if (n >= 153) {
            for (int i = 10; i < n; i++) {
                if (isArmstrong(i)) {
                    System.out.print(i + ",");
                }
            }
        } else {
            System.out.println("Number is less than 153");
        }
    }
}
