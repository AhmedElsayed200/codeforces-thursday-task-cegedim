
import java.util.Scanner;
 
public class Code {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t = Integer.parseInt(sc.nextLine());
		while(t>0) {
	        String x = sc.nextLine();
	        int len = x.length();
	        if(len>10) System.out.println(x.charAt(0)+String.valueOf(len-2)+x.charAt(len-1));
	        else System.out.println(x);
	        t-=1;
		}
        
    }
}