package inner;

public class stat {
	static int data=15;
static class inner{
	void msg() {
		System.out.print("the output of static is:"+data);
	}
}
	
	public static void main(String[] args) {
	stat.inner obj = new stat.inner();
     obj.msg();
	}

}
