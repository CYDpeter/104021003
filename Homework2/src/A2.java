import java.util.Scanner;
public class A2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入底");
		Float b = scn.nextFloat();
		System.out.print("請輸入高");
		Float h = scn.nextFloat();
		Float A = b*h/2;
		System.out.print("面積為"+A);
	}

}
