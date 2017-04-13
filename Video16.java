package divijsample;

import java.util.Scanner;

public class Video16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
        Tuna tunaObject = new Tuna();
        System.out.println("enter the name of your first GF:");
        String temp = input.nextLine();
        tunaObject.setName(temp);
        tunaObject.saying();
	}

}
