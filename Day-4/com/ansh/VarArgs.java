package ansh;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(4,56,1,6,41,6,1,6,4,3,1);
        multiple(2, 3, "Ansh","Pethe");
    }
    static  void multiple(int a,int b,String ...v){
        System.out.println(a+b);
        System.out.println(Arrays.toString(v));

    }
    static  void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
