import java.util.Scanner;
public class Whileex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入年分");
		int a = scn.nextInt();
		while((a%4!=0)||(a%100==0&&a%400!=0)){
		System.out.print("請輸入年分");
		 a = scn.nextInt();
	}
		System.out.print("你好棒~");
}
			
}
