package com.ansh;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //---------------- Type Conversion ---------
        
        /* 
        float num = input.nextFloat();
        System.out.println("Your Number is = "+num);
        */

        // -----------TypeCasting----------------

        /* 
        System.out.println("Enter a Float num");
        float floatNum = input.nextFloat();
        int num = (int)(floatNum); // (int)(723723.001f) also can do this
        System.out.println("Your casted Number is = "+num);
        */

        // -----------AutoMatic TypePromotion in expression----------------
        int a = 233;
        byte b = (byte)(a); // 233 % 256 = -23 
        byte c = 40;
        byte d= 50;
        byte e = 100;
        int f = a*d/e;
        System.out.println("Byte value is = "+f);
        System.out.println("null");

        //--------Rules for Type Promotion-------------
         // Rule-1: byte short char converted to [ int ]
         // Rule-2: long converted to [ int ]
         // Rule-3: float double converted to [ int ]
         // Rule-4: boolean converted to [ int ] with value 1 for true and 0 for false 

        // System.out.println("Byte value is = "+b);

        /*
        // This is not possible becz in time of evaluations it converts into int and how can be a int is stored in byte

        byte b = 50;
        b = b*5;
        */
    }
}
