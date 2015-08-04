import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入A值");
		int a = scn.nextInt();
		System.out.print("請輸入B值");
		int b = scn.nextInt();
		System.out.print("請輸入+、-、*、/");
		String c = scn.next();
		if(c.equals("+")){
			System.out.print("相加="+(a+b));
		}else{
			if(c.equals("-")){
				System.out.print("相減="+(a-b));
			}else{
				if(c.equals("*")){
					System.out.print("相乘="+(a*b));
				}else{
					if(c.equals("/")){
						System.out.print("相除="+(a/b));
					}
				}
			}
		}
	}

}
