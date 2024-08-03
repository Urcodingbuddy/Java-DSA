package ansh;
import java.util.Scanner;
public class Parm {
    public static void main(String[] args) {
        int ans = sum(20,50);
        System.out.println(ans);
        System.out.println("Enter Your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String personalgreet = myGreet(name);
        System.out.println(personalgreet);
    }

    static String myGreet(String name){
        String message = "Hello "+name;
        return message;
    }

    static int sum(int a,int b){
        int sum = a + b;
        return sum;
    }
}
