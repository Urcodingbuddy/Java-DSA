package ansh;
import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        greeting();
        int ans = sum2();
        System.out.println("Your Answer: "+ans);
        System.out.println("Hey Budyy"+sum2());
    }
    static void greeting(){
        System.out.println("Hello, World!");
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
        return sum;
    }
}
