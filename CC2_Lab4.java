import java.util.*;
	public class CC2_Lab4{
		public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		String name = " ";
		int age;
		System.out.println("Enter your name: ");
		name = scan.nextLine();
		System.out.println("Enter your age: ");
		age = scan.nextInt();
			if(name.equals ("Jhim") || name.equals ("Ethan")){
					if (age > 4 &&  age < 11 ){
						System.out.println("Hamster , Dog");
					}else if(age > 10 && age <16){
						System.out.println("Spider, Dog");
					}else if(age > 15 && age < 20){
						System.out.println("Dog, Snake");
					}else if (age == 21){
						System.out.println("No pets, Not Interested");
					}
			}else if(name.equals ("Sally") || name.equals ("Joy")){
					if (age > 4 &&  age < 11 ){
						System.out.println("Hamster , Cat");
					}else if(age > 10 && age < 16){
						System.out.println("Cat, Rabbit");
					}else if(age > 15 && age < 20){
						System.out.println("Cat");
					}else if (age >= 21){
						System.out.println("No pets, Not Interested");
					}
			}else{
        System.out.println("ERROR");
			}
		}
	}


