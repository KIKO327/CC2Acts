import java.util.*;
	public class NameTheUser{
		public static void main(String[]args){
		BufferedReader br = new BufferedReader(System.in);
		String name = " ";
		System.out.println("Enter your name: ");
		name = br.nextLine();
		System.out.println("Hi " + name );
		}
	}