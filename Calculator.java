import java.util.*; // To be able to use the Scanner class
  public class Calculator{ 
  public static void main(String [] mico){
    Scanner sc = new Scanner(System.in); // To allow the user to input data
    int a,b,d,n,m,Q; // Declarations of integers and string.                             
    String st = " "; 
    System.out.print("Enter # of operation: "); // The user enter the value of operation          
    Q = sc.nextInt();  // Q cointains the value that the user input
    if(1<=Q && 100 >= Q){  // To set the limit that will restore in int Q that the value will be entered by the user
    }
    System.out.print("Enter all operations in one line: ");// The user input the operation  
    for(int i=0; i<=Q;i++){// To be able to check the condition to perform
        st=sc.next(); 
          
        if(st.equals("negate")){//Algorithm of negate
           n=sc.nextInt();
          if(n<0){
            System.out.println(Math.abs(n));//The Math.abs() function returns the absolute value of the parameter passed to it. 
            System.out.println(n);
          }else{
            System.out.println("-" + n);
          }
        }
        else if(st.equals("add")){//Algorithm of add 
          a=sc.nextInt();
          b=sc.nextInt();
          d= a+b;
          System.out.println(d);
        }else if(st.equals("max")){//Algorithm of max
          a=sc.nextInt();
          b=sc.nextInt();
          if(a>b)System.out.println(a);
          else if(a<b)System.out.println(b);
          else System.out.println(a);
          }
        }       
     }
  }
   
 
  
  