import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		int arr[] = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
		boolean f = false;
		
		for(int i=0; i<arr.length; ++i) {
			if(n%arr[i]==0) {
				f = true; 
				break;
			}
		}
		
		if(f) System.out.println("YES");
		else System.out.println("NO");
}
}