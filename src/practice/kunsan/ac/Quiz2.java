package practice.kunsan.ac;

public class Quiz2 {
	public void solution() {
		int fibo01, fibo02, fibo03, sum;
		fibo01 = 1;
		fibo02 = 1;
		sum = 0;
		while (true) {
			fibo03 = fibo01 + fibo02;
			/*4백만 이하일 경우 루프 탈출*/
			if (fibo03 < 4000000)
				break;
			/*짝수인 경우에만 sum에 더해줌*/
			if(fibo03 % 2 == 0)
				sum += fibo03;
			fibo01 = fibo02;
			fibo02 = fibo03;
		}
		
		System.out.println("" + sum);
	}

}
