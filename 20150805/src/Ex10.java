import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("��J�ʧO�k��=1 �k��=2");
		int A = scn.nextInt();
		System.out.print("��J����");
		int H = scn.nextInt();
		int W;
		if(A==1){
			 W = (H-170)*6/10+62;
			 System.out.print("�з��魫="+W);
		}
	}

}
