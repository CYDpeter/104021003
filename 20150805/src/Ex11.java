import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入第一個整數");
		int a = scn.nextInt();
		System.out.print("請輸入第二個整數");
		int b = scn.nextInt();
		System.out.print("請輸入+、-、*");
		String c = scn.next();
		if(c.equals("+")){
			System.out.print("相加="+(a+b));
			}else{
				if(c.equals("-")){
					System.out.print("相減="+(a-b));
				}else{
					if(c.equals("*")){
						System.out.print("相乘="+(a*b));
					}
				}
			}
	}

}
