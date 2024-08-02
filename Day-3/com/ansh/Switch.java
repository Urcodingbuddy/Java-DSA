package  ansh;
import java.util.Scanner;
public class Switch{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 7:");
        int Day = in.nextInt();

        // switch(Day){

        // case 1 -> System.out.println("Monday");

        // case 2 -> System.out.println("Tuesday");
            
        // case 3 -> System.out.println("Wednesday");
        
        // case 4 -> System.out.println("Thursday");

        // case 5 -> System.out.println("Friday");
            
        // case 6 -> System.out.println("Saturday");

        // case 7 -> System.out.println("Sunday");

        // default -> System.out.println("Invalid Day");
  
        // }

        // switch(Day){
            
        //     case 1 : 
    
        //     case 2 : 
                
        //     case 3 :
            
        //     case 4 :
    
        //     case 5: System.out.println("WeekDay");
        //             break;
        //     case 6:
    
        //     case 7: System.out.println("WeekEnd");
        //             break;
    
        //     default : System.out.println("Invalid Day");
      
        //     } 👇🏼

        switch(Day){
            
            case 1, 2, 3, 4, 5 -> System.out.println("WeekDay"); 
    
            case 6, 7 -> System.out.println("WeekEnd"); 
                
            default -> System.out.println("Invalid Day");
      
            }

    }
}