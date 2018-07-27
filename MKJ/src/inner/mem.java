package inner;

public class mem {
	private int data=160;

	class Inner{  
		 void msg(){System.out.println("data is "+data);}  
		}

	public static void main(String[] args) {
		 mem obj=new mem();  
		mem.Inner in=obj.new Inner();  
		 in.msg(); 
	}

}