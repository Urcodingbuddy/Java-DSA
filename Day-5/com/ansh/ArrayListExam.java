package com.ansh;
import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListExam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Create an ArrayList
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(454);
        list.add(23);
        list.add(3654);
        // System.out.println(list); 
        // System.out.println("Does List Contains 454 ?  "+list.contains(454));
        // list.set(0,99);
        // System.out.println(list); 
        // System.out.println("Does List Contains 99 ?  "+list.contains(99));
        // list.remove(2);
        // System.out.println("List after Removing Index 2: "+list); 
        for(int i = 0;i<list.size();i++){
            list.add(in.nextInt());
        }
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
