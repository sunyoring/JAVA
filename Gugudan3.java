//������ ��� ���� ! �޼ҵ�� for���� �̿� !

public class Gugudan3 {

	public static int[] caculate(int times) {
		int[] result = new int[9];
		for(int i=0; i<result.length; i++) {
	result[i] = times*(i+1);
}return result;
	}
	public static void print(int[] result) {
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}
	}
		
	public static void main(String[] args) {
	
		for(int i = 2; i < 10 ; i++) {
			print(caculate(i));
		}
	}

}
