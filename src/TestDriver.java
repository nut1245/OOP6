
public class TestDriver {
	public static void main(String[]args) {
		Car c1 = new Car();
		c1.engineStart();
		c1.engineStop();
		
		ICar c2 = new Car();
		c2.engineStart();
		
	}
}
