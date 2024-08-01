package ninth;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = s.nextInt();
        System.out.print("Enter B: ");
        int b = s.nextInt();
        System.out.print("Enter C: ");
        int c = s.nextInt();
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println("The Maximum Value is: "+max);
    }
}