package ninth;

public class Conditional{
    public static void main(String[] args) {
        int salary = 25000;
          if (salary>15000) {
                salary = salary + 2000;
          }
          else{
            salary = salary + 1000;
          }
          System.out.println(salary);
    }
}
