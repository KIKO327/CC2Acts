import java.util.*;
public class KamoteSayote{
public static void main(String [] args){
  Scanner scan = new Scanner(System.in);
  int N , M , K = 0;
    System.out.print("Enter input: ");
    N = scan.nextInt();
    M = scan.nextInt();
    K = scan.nextInt();
    if(N <=1000 && N >=1 && M <=1000 && M >= 1 && K <=1000 && K >= 1){
    int x = N / M;
    int rem = N % M;
    int y = rem * K;

    System.out.println( x + " kamotes \n" + y + " sayotes ");
 
    }else{
      System.out.println("Invalid Input.");
      }
  }
}