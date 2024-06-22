package Basic;

public class SwapTwoNumbers {

	public void swapTheNumbers(int a, int b) {
		System.out.println("a = " +a+" and b = "+b+" value before swap");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " +a+" and b = "+b+" value after swap");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwapTwoNumbers().swapTheNumbers(9, 90);
	}
}
