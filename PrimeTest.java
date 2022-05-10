package prime;

public class PrimeTest {
	
	public static int number;
	public static int numbers[] = {2, 3, 4, 5, 6};
	
	public static void Test() {
		number = numbers[0];
		System.out.println(number);
	}
	
	public static void Test2() {
		number = numbers[1];
		System.out.println(number);
	}
	
	public static void Test3() {
		number = numbers[2];
		System.out.println(number);
	}
	
	public static void Test4() {
		number = numbers[3];
		System.out.println(number);
	}
	
	public static void Test5() {
		number = numbers[4];
		System.out.println(number);
	}
	
	
	
	
	public static void main(String[] args) {
		Test();
		Prime.isPrime();
		Test2();
		Prime.isPrime();
		Test3();
		Prime.isPrime();
		Test4();
		Prime.isPrime();
		Test5();
		Prime.isPrime();
		
			
		
		
	}

}
