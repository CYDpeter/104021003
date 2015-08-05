import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入三角形最小的邊長");
		float a = scn.nextFloat();
		System.out.print("請輸入三角形第二大的邊長");
		float b = scn.nextFloat();
		System.out.print("請輸入三角形最大的邊長");
		float c = scn.nextFloat();
		if(c<a+b){
			System.out.print("此為合法三角形");
		}else{
			if(c>a+b){
			System.out.print("此為非法三角形");
		}
	}
	}
}
