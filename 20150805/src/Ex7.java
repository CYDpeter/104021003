import java.util.Scanner;
public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入上學期獲得學分");
		int A = scn.nextInt();
		System.out.print("輸入下學期獲得學分");
		int B = scn.nextInt();
		if(A+B>=22){
			System.out.print("在學");
		}else{
			if(A+B<22){
				System.out.print("退學");
			}
		}
	}

}
