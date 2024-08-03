package ansh;

public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        // THis is Called Shadowing
        int x = 49;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
        // Prints 90 :)_\]
    }
}
