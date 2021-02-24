import java.util.Scanner;

public class GugudanFinalMission {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int dan = scanner.nextInt();				
		int[] result = new int[dan];
		
		for (int i=1; i < dan+1; i++) {
			int number =i;
			
			for(int j =0; j < result.length; j++) {
				result[j] = j+1;
				System.out.println(number+" X "+result[j]+" = " + number*result[j]);
			}
		
		}
	}
}


		
	
