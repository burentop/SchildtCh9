
public class ExcTest {

	static void genException() {
		int nums[] = new int[4];
		
		System.out.println("Before exception is generated.");
		
		// generate error
		nums[7] = 10;
		System.out.println("won't be displayed");
	}
	
}
