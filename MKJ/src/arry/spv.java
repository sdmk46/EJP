package arry;

import java.lang.reflect.Array;

public class spv {

	public static String contains(int[] arr,int item )
	{
		for (int i : arr)
		{
				if(item==i)		
					{
						return "found";
						}
		}
	
		return "notfound";
	}



		public static void main(String[] args)
		{
			int[] value= {5,6,7,8,9,10,11,12,14,15,12};
			System.out.print(contains(value,11));
		
		}}