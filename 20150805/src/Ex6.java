import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�̵u��");
		int a = scn.nextInt();
		System.out.print("�п�J�ĤG����");
		int b = scn.nextInt();
		System.out.print("�п�J�̪���");
		int c = scn.nextInt();
		if(a*a+b*b<c*c){
		System.out.print("�����w���T����");
		}else{
			if(a*a+b*b==c*c){
				System.out.print("���������T����");
			}else{
				if(a*a+b*b>c*c){
					System.out.print("�����w���T����");
					
				}
			}
		}
	}

}
