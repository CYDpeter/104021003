import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J��妨�Z");
		float C = scn.nextFloat();
		System.out.print("�п�J�^�妨�Z");
		float E = scn.nextFloat();
		System.out.print("�п�J�ƾǦ��Z");
		float M = scn.nextFloat();
		float A = C+E+M;
		System.out.print("�`����"+A);
		float B =(C+E+M)/3;
		System.out.print("������"+B);
	}

}
