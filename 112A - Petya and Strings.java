import java.util.Scanner;

public class main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		int len = str1.length();
		int res = 0;
		
		for(int i=0; i<len; ++i) {
			int x1 = (int)Character.toLowerCase(str1.charAt(i));
			int x2 = (int)Character.toLowerCase(str2.charAt(i));
			if(x1 != x2) {
				res = x1-x2;
				break;
			}
		}
		
		if(res>0) System.out.println(1);
		else if(res<0) System.out.println(-1);
		else System.out.println(0);
		
	}

}
