package divijsample;
import java.util.Scanner;

public class Basiccaliculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Scanner divij = new Scanner(System.in);
              double fnum, snum, answer;
              System.out.println("Enter first num: ");
              fnum=divij.nextDouble();
              System.out.println("Enter second num: ");
              snum=divij.nextDouble();
              answer= fnum+snum;
              System.out.println(answer);
	}

}
