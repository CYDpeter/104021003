import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�T���γ̤p�����");
		float a = scn.nextFloat();
		System.out.print("�п�J�T���βĤG�j�����");
		float b = scn.nextFloat();
		System.out.print("�п�J�T���γ̤j�����");
		float c = scn.nextFloat();
		if(c<a+b){
			System.out.print("�����X�k�T����");
		}else{
			if(c>a+b){
			System.out.print("�����D�k�T����");
		}
	}
	}
}
