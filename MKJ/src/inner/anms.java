package inner;

abstract class Flyable{
	abstract void fly();
}


public class anms {
	
	public static void main(String[] args) {
		Flyable f=new Flyable()
		{
			void fly() {
				System.out.println("can fly");
			}
		};
		f.fly();

	}

}
