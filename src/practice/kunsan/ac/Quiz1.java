package practice.kunsan.ac;

//Quiz1
public class Quiz1 {
	public static void main(String[] args) {
	
	int num1 = 3;
	int num2 = 5;
	
	method1(num1, num2);

	}
	
	public static void method1(int num1, int num2) {
		int sum = 0;
		
		for(int i=1; i<1000; i++) {
			if(i%num1==3 || i%num2 ==0) {
				sum+=i;
			}
		}
		
		System.out.println("sum: " + sum);
	}
}