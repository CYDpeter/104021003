import java.util.Scanner;
public class Whiletext1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		int n = 0,m = 0;
		float result = 0.0f;
		char op = ' ';
		String str = "Y";
		while(!str.equals("N")&&!str.equals("n")){
		n = scn.nextInt();
		m = scn.nextInt();
		op = scn.next().charAt(0);
		if(op=='+'){
			result = n+m;
		}
		if(op=='-'){
			result = n-m;
		}
		if(op=='*'){
			result = n*m;
		}
		if(op=='/'){
			result = n/m;
		}
		System.out.println(result);
		System.out.print("Ä~Äò?(y/n)");
		str = scn.next();
		}
		System.out.print("ÁÂÁÂ¨Ï¥Î");
	}

}
