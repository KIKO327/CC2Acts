public class CC2_Lab3 {
public static void main(String[]args){
  char m = 'M' ;
  char i = 'I' ;
  char c = 'C';
  char o = 'O' ;
  char ex = '!';
 
  int a = 77;
  int b = 73;
  int x = 67;
  int d = 79;
  int e = 33;
  int sum = a+b+x+d+e;
  int pro = a*b*x*d*e;
  int ave = a+b+x+d+e/4;
  int rem = pro%ave;
System.out.print( m + "-" + a + "\n" + i + "-" + b + "\n" + c + "-" + x + "\n" + o + "-" + d + " \n" + ex + "-" + e +"\n"+m+i+c+o+ex+ "\n"+
"Sum: " + sum + "\n" + "Product: "+ pro + "\n" + "Average: " + ave + "\n" + "Remainder: " + rem );

}
}
