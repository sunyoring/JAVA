
public class GugudanMain {
	public static void main(String[] args) {

		// for���� �̿�, �迭�� �� �Է� -> 2�� ���
				
				for(int i=2; i < 10; i ++) {
					int[] result = Gugudan2.caculate(i);
					Gugudan2.print(result);
				}
				 //Gugudan2Ŭ������ ȣ���Ͽ� ������ ���
				
				for(int i=2; i<10; i++) {
					Gugudan3.print(Gugudan3.caculate(i));
				}
				//Gugudan3Ŭ������ ȣ���Ͽ� ������ ���
 }
}
