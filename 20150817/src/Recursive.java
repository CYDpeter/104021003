import java.util.Scanner;

public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("n:");
		int n = scn.nextInt();
		System.out.println(n + "!=" + fac(n));// 印出所輸入n!之階乘函數
	}// fac階乘函數是用 「遞迴」 寫的

	public static int fac(int v1) {// 公開的靜態常式為整數階乘函數設為整數v1
		if (v1 == 1) {// 假如v1==1時
			return 1;// 1返回回去
		} else {// 若大於1時
			return v1 * fac(v1 - 1);// 遞迴fac呼叫自己後返回回去
		}
	}

}
