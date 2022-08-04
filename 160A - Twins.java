import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;


public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.nextLine());
		int arr[] = new int[n];
		int sum = 0, taken = 0, sumTaken = 0;
		
		for(int i=0; i<n; ++i) {
			int x = sc.nextInt();
			arr[i]=x;
			sum+=x;
		}
		
		Arrays.sort(arr);

		for(int i=n-1; i>=0; --i) {
			if(sumTaken>sum/2) break;
			sumTaken += arr[i];
			taken++;
			
		}

		System.out.println(taken);
		
}
}