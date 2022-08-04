import java.util.Scanner;
import java.lang.Math;


public class main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int iLoc = 0, jLoc = 0;
		
		for(int i=0; i<5; ++i) {
			for(int j=0; j<5; ++j) {
				int n = sc.nextInt();
				if(n==1) {
					iLoc = i; jLoc = j;
				}
			}
		}
		System.out.println(Math.abs(2-iLoc)+Math.abs(2-jLoc));
}
}