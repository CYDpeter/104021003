import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("½Ð¿é¤J13");
		int a = scn.nextInt();
		int sum = 0;
		for(a=13;a<=1399&&a>=13;a=a+1){
			sum = sum+a;			
		}
		System.out.print("Sum="+sum);
	}

}
