import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("½Ð¿é¤J17");
		int i = scn.nextInt();
		int sum =0 ;
		for(i=17;i<=1399;i=i+17){
			sum = sum+i;
		}
		System.out.print("Sum="+sum);
	}

}
