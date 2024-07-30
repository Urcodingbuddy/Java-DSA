package com.ansh.Assignments;
import java.util.Scanner;
public class Simple_intrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = in.nextDouble();
        System.out.print("Enter the rate: ");
        double rate = in.nextDouble();
        System.out.print("Enter the time: ");
        double time = in.nextDouble();
        double SI = (principal*rate*time) / 100;
        System.out.println("Simple Interest: " + SI);

    }
}
