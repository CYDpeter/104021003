import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�JA��");
		int a = scn.nextInt();
		System.out.print("�п�JB��");
		int b = scn.nextInt();
		System.out.print("�п�J+�B-�B*�B/");
		String c = scn.next();
		if(c.equals("+")){
			System.out.print("�ۥ[="+(a+b));
		}else{
			if(c.equals("-")){
				System.out.print("�۴�="+(a-b));
			}else{
				if(c.equals("*")){
					System.out.print("�ۭ�="+(a*b));
				}else{
					if(c.equals("/")){
						System.out.print("�۰�="+(a/b));
					}
				}
			}
		}
	}

}
