import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		int len = str.length();

		int arr[] = new int[len/2+1];
		
		int j = 0;
		for(int i=0; i<len; i+=2) {
//			System.out.println("j="+j);
			arr[j] = Character.getNumericValue(str.charAt(i));
			j++;
//			System.out.println("i="+i);
			
		}
		
		Arrays.sort(arr);
		
		for(int i=0; i<j; ++i) {
			System.out.print(arr[i]);
			if(i<j-1) System.out.print("+");
		}
		
	}

}