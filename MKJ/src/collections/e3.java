package collections;

import java.util.ArrayList;

public class e3 {
		
		public static void main(String[] args) {
			
			ArrayList<String> ls = new ArrayList<String>();
			 ls.add("1st");
			  ls.add("2ND");
			  ls.add("3RD");
			  ls.add("4TH");
			  ls.add("5TH");
			  ls.add("6TH");
			 ls.add(0, "7th"); 
			 ls.remove(4);
			 
			System.out.println("the colours are"+ls);
		}

	}
