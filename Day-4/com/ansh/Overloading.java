package ansh;

public class Overloading {
    public static void main(String[] args) {
        fun(64);
        fun("Ansh pethe");
    }
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
