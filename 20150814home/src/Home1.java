import java.util.Scanner;

public class Home1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�JA��");
		int A = scn.nextInt();
		System.out.print("�п�JB��");
		int B = scn.nextInt();
		if (A > B) {
			System.out.println(A + "�j��" + B);
		} else {
			if (A < B) {
				System.out.println(A + "�p��" + B);
			} else {
				if (A == B) {
					System.out.println(A + "����" + B);
				}
			}
		}
	}

}
