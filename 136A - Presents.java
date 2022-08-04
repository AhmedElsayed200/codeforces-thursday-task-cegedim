import java.util.Scanner;
import java.lang.Math;


public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[110];
		
		int n = Integer.parseInt(sc.nextLine());
			
		for(int i=1; i<=n; ++i) {
			int x = sc.nextInt();
			arr[x]=i;
		}
		
		for(int i=1; i<=n; ++i) {
			System.out.print(arr[i]+" ");
		}
		
}
}