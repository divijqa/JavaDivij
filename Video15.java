package divijsample;
import java.util.Scanner;
public class Video15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner input = new Scanner(System.in);
             Tuna tunaObject = new Tuna();
             System.out.println("enter your name");
             String name = input.nextLine();
             
             tunaObject.simpleMessage(name);
	}

}
