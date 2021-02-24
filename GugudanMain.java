
public class GugudanMain {
	public static void main(String[] args) {

		// for문을 이용, 배열에 값 입력 -> 2단 출력
				
				for(int i=2; i < 10; i ++) {
					int[] result = Gugudan2.caculate(i);
					Gugudan2.print(result);
				}
				 //Gugudan2클래스를 호출하여 구구단 출력
				
				for(int i=2; i<10; i++) {
					Gugudan3.print(Gugudan3.caculate(i));
				}
				//Gugudan3클래스를 호출하여 구구단 출력
 }
}
