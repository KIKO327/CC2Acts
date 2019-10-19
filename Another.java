import java.util.*;
import java.io.*;
public class Another{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter 6 numbers: ");
try{
int fi = sc.nextInt();
int se = sc.nextInt();
int th = sc.nextInt();
int fo = sc.nextInt();
int ft = sc.nextInt();
int si = sc.nextInt();

if(fi>=0 && fi<=9 || se>=0 && se<=9 || th>=0 && th<=9 || fo>=0 && fo<=9 || ft>=0 && ft<=9|| si>=0 && si<=9 ){
for(int num = 11; num<=99; num++){
  if(num/10 == fi || num/10 == se  || num/10 == th  || num/10 == fo || num/10 == ft || num/10 == si){
  continue;
  }else if(num%10 == fi || num%10 == se  || num%10 == th  || num%10 == fo || num%10 == ft || num%10 == si){
	continue;

	}else{
  System.out.print(num);
  System.out.print("\n");
}
}
}else{
  System.out.print("Invalid Input!");
}
}catch(InputMismatchException e){
   System.out.print("Invalid Input!");
}
}
}

