import java.util.*;
import java.lang.Math;

public class Time {
   public static void main(String [] args){
   Scanner scan = new Scanner(System.in);
   int minutes;
   int hours;
   int tminutes;
   int theHours = 60;
   int finalTime;
   System.out.println("Enter number of minutes: ");
   minutes = scan.nextInt();
   tminutes =  minutes / theHours;
   finalTime = minutes % theHours;
   System.out.println(minutes + " minutes is " + tminutes + " hours and " + finalTime + " minutes." );

}


}
