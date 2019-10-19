import java.io.*;
import java.text.DecimalFormat;
    public class Room{
    public static void main(String [] args)throws IOException{
        double length = 0;
        double width = 0;
        double area = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.println("Enter length: ");
    length=Double.parseDouble(br.readLine());
    
    System.out.println("Enter width: ");
    width=Double.parseDouble(br.readLine());
    
    area = length*width;
    DecimalFormat df = new DecimalFormat("0.00");
    System.out.println("The floor space of the room is " + df.format(area) + " square units.");

}
}