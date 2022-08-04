import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String res = "hello";
		int len = str.length();
		int j = 0;
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == res.charAt(j))
				j++;
			if (j == res.length())
				break;
		}
		if (j >= 5)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}