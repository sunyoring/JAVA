import java.util.Scanner;


public class Gugudan {

	public static void main(String[] args) {
		// 2��
//		System.out.println("2��");
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
		
		//3��
//		System.out.println("3��");
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
//		//4��
//		System.out.println("4��");
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
		
		//������ ScannerŬ������ �̿��� ������ ��� !
//		System.out.println("������ �� ����� ����?");
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
		
		//6��
//		System.out.println("6��");
//		int i = 1;
//			while(i<10) {
//				System.out.println(i*6);
//				i++;
//			}
//		//7��
//		System.out.println("7��");
//			for(int j=1; j<10; j++) {
//				System.out.println(j*7);
//			}
		

		//8,9��  // ���ǹ��� ����� ������ ��� !
		
		System.out.println("������ �� ����� ����? : ");
		Scanner scanner4 = new Scanner(System.in);
		int number = scanner4.nextInt();
		System.out.println("����ڰ� �Է��� �� : " + number);
		
		if(number < 2 || 9 < number ) {
			System.out.println("���� �߸� �Է��߽��ϴ�.");}
				else {
					for(int i =1; i <10; i++) {
						System.out.println(number + " x " + i + " = " + number * i);
				}
			}
		
		// �� �������� ��
//		A && B = and ����, A�� B�� �� �� ���� ���� ���̴�.
//		A  ||  B = or ����, A�� B �� �߿� �ϳ��� ���̸� ���̴�.
//		 !A       = A�� ���̶�� ����, A�� �����̶�� ���� �ȴ�.
		

		
		

		
		
		
		
//�Ʒ����ʹ� ���Ǹ� ��� �� ȥ�� ¥ �� �ڵ��̴�.		
		
		
		
		// while �ݺ����� ScannerŬ������ �̿��� ������ ��� !
//		System.out.println("������ �� ����� ����?");
//		Scanner scanner2 = new Scanner(System.in);
//		int number = scanner2.nextInt();
//		int i = 1;
//		
//		while(i < 10) {
//			System.out.println(i*number);
//			i++;
//		}		

		//for�ݺ����� ScannerŬ������ �̿��� ������ ��� !
//		 System.out.println("������ �� ����� ����?");
//		 Scanner scanner3 = new Scanner(System.in);
//		 int number = scanner3.nextInt();
//		 for(int k=1; k<10; k++) {
//			 System.out.println(number+"x"+k+"="+k*number);
//		 }
	}

}
