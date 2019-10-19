import java.lang.Math;
	public class CC2_Lab5{
		public static void main(String[]args){
		double rand = Math.random()*1000;
		int messageCount = (int)rand;
		
		float charge = 0.5f;
		if(rand >= 200){
			System.out.println("You have sent " + messageCount);
			System.out.println("You have incurred " +(messageCount*charge)+ " PHP in charges");
		}else{
			System.out.println("You have sent 200 messages");
			
		}
		}
	}

