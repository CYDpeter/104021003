import java.util.Scanner;
public class Whileex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�~��");
		int a = scn.nextInt();
		while((a%4!=0)||(a%100==0&&a%400!=0)){
		System.out.print("�п�J�~��");
		 a = scn.nextInt();
	}
		System.out.print("�A�n��~");
}
			
}
