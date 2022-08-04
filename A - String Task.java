import java.util.*;
 
public class HelloWorld {
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String st = sc.nextLine();
		String res = "";
		int len = st.length();
		for (int i = 0; i < len; i++) {
            char ch = Character.toLowerCase(st.charAt(i));
            if(ch == 'a' || ch == 'o' || ch == 'y' || ch == 'e'|| ch == 'u'|| ch == 'i'){
                continue;
            }else{
                res = res + "." + ch;
            }
        }
        System.out.println(res);
        
    }
}