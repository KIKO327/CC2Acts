import javax.swing.*;
public class Initials{
public static void main(String [] args){
 String finitial = " ",input;
 String minitial = " ";
 String linitial = " ";
 
;	finitial = JOptionPane.showInputDialog("Enter your first name's inital");
	minitial = JOptionPane.showInputDialog("Enter your middle name's inital");
	linitial = JOptionPane.showInputDialog("Enter your last name's inital");
  char guessChar = finitial.charAt(0);
  char charM = minitial.charAt(0);
  char charL = linitial.charAt(0);
	JOptionPane.showMessageDialog(null, guessChar + "." + charM + "." + charL);
}
}