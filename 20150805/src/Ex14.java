import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J����(cm)");
		float h = scn.nextFloat();
		System.out.print("�п�J�魫(kg)");
		float w = scn.nextFloat();
		float A = h*394/1000;
		System.out.print("���⨭����"+A+"�^�T");
		float B = w*2205/1000;
		System.out.print("�����魫��"+B+"�S");
	}

}
