import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("��J�W�Ǵ���o�Ǥ�");
		int A = scn.nextInt();
		System.out.print("��J�U�Ǵ���o�Ǥ�");
		int B = scn.nextInt();
		if(A+B>=22){
			System.out.print("�b��");
		}else{
			if(A+B<22){
				System.out.print("�h��");
			}
		}
	}

}
