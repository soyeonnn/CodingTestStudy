package lecture0712;

public class Main {
	
	public static void main(String[] args) {
		InstanceTest test;
		System.out.println("3번출력");
		int k = InstanceTest.myCall("4번출력");
		test = new InstanceTest();
		test.printMsg("5번출력");
	}
}