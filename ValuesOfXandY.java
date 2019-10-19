import java.util.*;
public class ValuesOfXandY{
public static void main(String [] mico){
  Scanner s = new Scanner(System.in);
  int x = 0;
  int y = 0;
  int m = 0;
  int R = 0;
  System.out.println("Enter the value of x: ");
  x = s.nextInt();
  System.out.println("Enter the value of y: ");
  y = s.nextInt();
  m = (x-y);
  if(m<0){
   R = (x+y);
   }else if(m == 0){
   R = (2*x+ 2*y);   
   }else if(m>0){
   R = (x*y);
   }
   System.out.println("The value of x is: " + x + " The value of Y is: "+ y + " The value of R is: " + R);
    }
}
