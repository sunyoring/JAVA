public class Gugudan2 {
	public static int[] caculate(int times) {
		int[] result = new int[9];
		for(int i=0; i< result.length; i++) {
			result[i] =times *( i+1);
		}
	return result;
	}
	public static void print(int[] result) {
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
	}
  }	
}
									
//		//반복문으로 배열의 값을 저장하고
//		//반복문을 중첩시켜 구구단을 출력하는 방법 !
//		
//		for(int i=2; i < 10; i++) {
//			int number= i;		
//					
//		for(int j = 0; j <result.length; j++) {
//			result[j] = number * (j+1);
//		}
//		for (int k =0; k<result.length; k++) {
//			System.out.println(number + " x " + (k+1) +" = "+ result[k]);
//		 }
//		}
	

	

