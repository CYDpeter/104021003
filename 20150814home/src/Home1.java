import java.util.Scanner;

public class Home1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入A值");
		int A = scn.nextInt();
		System.out.print("請輸入B值");
		int B = scn.nextInt();
		if (A > B) {
			System.out.println(A + "大於" + B);
		} else {
			if (A < B) {
				System.out.println(A + "小於" + B);
			} else {
				if (A == B) {
					System.out.println(A + "等於" + B);
				}
			}
		}
	}

}
