import java.util.*;
import java.io.*;
public class Ascending{
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
int num = 11;
while(num<=99){
	int ts= num/10;
	int os= num%10;
	boolean tss = ts == fi || ts == se || ts == th || ts == fo || ts == ft || ts == si;
	boolean oss = os == fi || os == se || os == th || os == fo || os == ft || os == si;
	if(tss == true||oss == true){
        num++;
   
	}else{
				System.out.println(num);
        num++;
		}
}
}else{
  System.out.print("Invalid Input!");
}
}
catch(InputMismatchException e){
   System.out.print("Invalid Input!");
}
}
}
