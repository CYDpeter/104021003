import java.util.Scanner;
public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入三角形底");
		Float b = scn.nextFloat();
		System.out.print("請輸入三角形高");
		Float h = scn.nextFloat();
		Float A = b*h/2;
		System.out.print("三角形面積為"+A);
	}

}
