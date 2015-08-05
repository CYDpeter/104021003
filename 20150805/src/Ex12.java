import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入國文成績");
		float C = scn.nextFloat();
		System.out.print("請輸入英文成績");
		float E = scn.nextFloat();
		System.out.print("請輸入數學成績");
		float M = scn.nextFloat();
		float A = C+E+M;
		System.out.print("總分為"+A);
		float B =(C+E+M)/3;
		System.out.print("平均為"+B);
	}

}
