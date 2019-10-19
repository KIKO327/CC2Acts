public class VariablesAndDataTypes {
public static void main(String[]args){

String a = "The temperature in Baguio City has warmed throughout the years.";
char b = 'A';
double c = 16.0;
float d = 23.5f;
byte e = 4;
short f = 7;
int g = 12;
long h = 24L;

boolean n = true;
if(n == true){
  System.out.print(a+"\n"+ "\t" +b+ " recent news article stated that the City has been averaging " +c+ " degrees celsius at dawn and " + d + " at noon \n"+"\t"+"\t"+
"Regardless, lowlanders still feel cold "+ h +" hours a day, "+ f +" days a week, "+ e +" weeks per month and " + g + " months a year.");
  }else{
   System.out.print("The boolean was changed to a False Value");
  }
}
}
