package divij6;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {
	//Map consist of key value pairs
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//It can only take single duplicate key and ,multiple duplicate values
				Map<Integer,String> names = new HashMap<>();
				names.put(1, "avinash");
				names.put(2, "arun");
				names.put(3, "yamini");
				names.put(4, "sahithi");
				System.out.println(names.keySet());
				System.out.println(names.values());
				names.remove(4);
				System.out.println(names.keySet());
				System.out.println(names.values());

	}

}
