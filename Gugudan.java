import java.util.Scanner;


public class Gugudan {

	public static void main(String[] args) {
		// 2단
//		System.out.println("2단");
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
		
		//3단
//		System.out.println("3단");
//		System.out.println(3*1);
//		System.out.println(3*2);
//		System.out.println(3*3);
//		System.out.println(3*4);
//		System.out.println(3*5);
//		System.out.println(3*6);
//		System.out.println(3*7);
//		System.out.println(3*8);
//		System.out.println(3*9);
//		
//		//4단
//		System.out.println("4단");
//		int result = 4 * 1;
//		System.out.println(result);
//		result = 4 * 2;
//		System.out.println(result);
//		result = 4 * 3;
//		System.out.println(result);
//		result = 4 * 4;
//		System.out.println(result);
//		result = 4 * 5;
//		System.out.println(result);
//		result = 4 * 6;
//		System.out.println(result);
//		result = 4 * 7;
//		System.out.println(result);
//		result = 4 * 8;
//		System.out.println(result);
//		result = 4 * 9;
//		System.out.println(result);
		
		//변수와 Scanner클래스를 이용한 구구단 출력 !
//		System.out.println("구구단 중 출력할 단은?");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);
		
		//6단
//		System.out.println("6단");
//		int i = 1;
//			while(i<10) {
//				System.out.println(i*6);
//				i++;
//			}
//		//7단
//		System.out.println("7단");
//			for(int j=1; j<10; j++) {
//				System.out.println(j*7);
//			}
		

		//8,9단  // 조건문을 상요한 구구단 출력 !
		
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner4 = new Scanner(System.in);
		int number = scanner4.nextInt();
		System.out.println("사용자가 입력한 값 : " + number);
		
		if(number < 2 || 9 < number ) {
			System.out.println("값을 잘못 입력했습니다.");}
				else {
					for(int i =1; i <10; i++) {
						System.out.println(number + " x " + i + " = " + number * i);
				}
			}
		
		// ★ 논리연산자 ★
//		A && B = and 연산, A와 B가 둘 다 참일 때만 참이다.
//		A  ||  B = or 연산, A와 B 둘 중에 하나만 참이면 참이다.
//		 !A       = A가 참이라면 거짓, A가 거짓이라면 참이 된다.
		

		
		

		
		
		
		
//아래부터는 강의를 듣기 전 혼자 짜 본 코드이다.		
		
		
		
		// while 반복문과 Scanner클래스를 이용한 구구단 출력 !
//		System.out.println("구구단 중 출력할 단은?");
//		Scanner scanner2 = new Scanner(System.in);
//		int number = scanner2.nextInt();
//		int i = 1;
//		
//		while(i < 10) {
//			System.out.println(i*number);
//			i++;
//		}		

		//for반복문과 Scanner클래스를 이용한 구구단 출력 !
//		 System.out.println("구구단 중 출력할 단은?");
//		 Scanner scanner3 = new Scanner(System.in);
//		 int number = scanner3.nextInt();
//		 for(int k=1; k<10; k++) {
//			 System.out.println(number+"x"+k+"="+k*number);
//		 }
	}

}
