import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一正整數");
		int a = scn.nextInt();
		if(a%2==0){
			System.out.print(a+"為偶數");
		}else{
			System.out.print(a+"為奇數");
		}
	}

}
