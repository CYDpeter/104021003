import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入身高(cm)");
		float h = scn.nextFloat();
		System.out.print("請輸入體重(kg)");
		float w = scn.nextFloat();
		float A = h*394/1000;
		System.out.print("換算身高為"+A+"英吋");
		float B = w*2205/1000;
		System.out.print("換算體重為"+B+"磅");
	}

}
