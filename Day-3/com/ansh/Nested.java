package com.ansh;

import java.util.Scanner;

public class Nested {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int empID = in.nextInt();
            String department = in.next();
            
            switch(empID){
                case 1 -> System.out.print("Ansh");
                case 2 -> System.out.print("Pethe");
                case 3 -> {
                    System.out.println("Emp Number 3");
                    switch(department){
                        case "IT" -> System.out.print("IT Department");
                        case "Managment" -> System.out.print("Managment Department");
                        default -> System.out.print("Invalid Department");
                    }
                   
                }
                default -> System.out.print("Invalid Emp ID :)");

                }
        }
}
