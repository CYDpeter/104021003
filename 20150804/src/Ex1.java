import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�JA��");
		int a = scn.nextInt();
		System.out.print("�п�JB��");
		int b = scn.nextInt();
		if(a>b){
			System.out.print(a+">"+b);
		}else{
			if(a<b){
				System.out.print(a+"<"+b);	
			}else{
				if(a==b){
					System.out.print(a+"="+b);
				}
			}
		}

	}
}

