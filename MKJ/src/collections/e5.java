package collections;

import java.util.ArrayList;

public class e5 {

	public static void main(String[] args) {

		ArrayList<String> ls = new ArrayList<String>();
		 ls.add("1st");
		  ls.add("2ND");
		  ls.add("3RD");
		  ls.add("4TH");
		  ls.add("5TH");
		  ls.add("6TH");
		 ls.set(3, "any");
		// retrieves element at 4th postion
	      String retval = ls.get(3);
	      System.out.println("Retrieved element is = " + retval);	
		 

	}

}
