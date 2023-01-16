package homework12_4;

class Derived04 {
	
	protected void getDetails() {
		System.out.println("Derived class");
	}

}

public class Test04 extends Derived04{
	
	protected final void getDetails() {
		System.out.println("Test class ");
	}
	
	public static void main(String[] args) {
		Derived04 obj = new Derived04();
		obj.getDetails();
	}


}
