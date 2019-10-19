import java.util.*;
public class MonthlySalary{
public static void main(String [] mico){
  Scanner s = new Scanner(System.in);
  String name;
  int ms = 0;
  System.out.println("ENTER YOUR NAME: ");
  name = s.nextLine();
  System.out.println("ENTER YOUR MONTHLY SALARY: ");
  ms = s.nextInt();
  if(ms<1000){
  System.out.println(name + " your bonus is: " + (ms*.50));
   }else
    System.out.println(name + " your bonus is: 1000" );
  }


}