package divij6;

import java.util.HashSet;
import java.util.Set;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				//Set cannot take duplicate values
				Set<String> names = new HashSet<>();
				names.add("kiran");
				names.add("manu");
				names.add("prashanth");
				names.add("anvesh");
				names.add("nomji");
				names.add("sharath");
				System.out.println(names.size());
				for(String s :names){
					System.out.println(s);
				}
				names.remove("nomji");
				System.out.println(names.size());
				

	}

}
