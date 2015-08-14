import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("n=");
		int n = scn.nextInt();
		System.out.print("m=");
		int m = scn.nextInt();
		int c = (int) (fun1(n) / (fun1(m) * fun1(n - m)));
		System.out.println("C^n_m=" + c);
		fun2(n, m);
	}

	public static long fun1(int v1) {
		long result = 1;
		for (int i = 1; i <= v1; i++) {
			result *= i;
		}
		return result;
	}

	public static void fun2(int v1, int v2) {
		System.out.println("Result2==>C^n_m=" + (fun1(v1) / (fun1(v2) * fun1(v1 - v2))));
	}
}
