package homework12_1;

class ParentClass {
	public void getDetails(String temp) {
		System.out.println("Derived class " + temp);
	}

}
public class Test01 extends ParentClass{
	
	public int getDetails(int temp) {
		System.out.println("Test class " + temp);
		return 0;
	}
	public static void main(String[] args) {
		Test01 obj = new Test01();
		obj.getDetails("GFG");
	}


}
