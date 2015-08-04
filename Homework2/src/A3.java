import java.util.Scanner;
public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入上底");
		Float a = scn.nextFloat();
		System.out.print("請輸入下底");
		Float b = scn.nextFloat();
		System.out.print("請輸入高");
		Float c = scn.nextFloat();
		Float A = (a+b)*c/2;
		System.out.print("面積="+A);
	}

}
