package practice.kunsan.ac;

public class Quiz2 {
	public void solution() {
		int fibo01, fibo02, fibo03, sum;
		fibo01 = 1;
		fibo02 = 1;
		sum = 0;
		while (true) {
			fibo03 = fibo01 + fibo02;
			/*4�鸸 ������ ��� ���� Ż��*/
			if (fibo03 < 4000000)
				break;
			/*¦���� ��쿡�� sum�� ������*/
			if(fibo03 % 2 == 0)
				sum += fibo03;
			fibo01 = fibo02;
			fibo02 = fibo03;
		}
		
		System.out.println("" + sum);
	}

}
