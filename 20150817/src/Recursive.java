import java.util.Scanner;

public class Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("n:");
		int n = scn.nextInt();
		System.out.println(n + "!=" + fac(n));// �L�X�ҿ�Jn!���������
	}// fac������ƬO�� �u���j�v �g��

	public static int fac(int v1) {// ���}���R�A�`������ƶ�����Ƴ]�����v1
		if (v1 == 1) {// ���pv1==1��
			return 1;// 1��^�^�h
		} else {// �Y�j��1��
			return v1 * fac(v1 - 1);// ���jfac�I�s�ۤv���^�^�h
		}
	}

}
