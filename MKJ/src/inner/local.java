package inner;

public class local {
	private int data=10;
	
	void display() {
		class LocalInner{
			void msg() {
				System.out.println("the data is :"+data);
			
			}}
			LocalInner local =new LocalInner();
					local.msg();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
local obj=new local();
obj.display();
		
	}

}
