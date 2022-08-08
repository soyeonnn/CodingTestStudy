package lecture0712;

public class InstanceTest {

	// fields
	int a = myCall("1번출력");
	static int b = myCall("2번출력");
	
	// constructor
	public InstanceTest() {
		
	}
	
	// method
	public static int myCall(String msg) {
		System.out.println(msg);
		return 100;
	}
	
	public void printMsg(String msg) {
		int a = 100;
		System.out.println(msg);
	}
}