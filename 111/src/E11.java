import java.util.Scanner;
public class E11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("¬Y¼Æ");
		int n = scn.nextInt();
		int i ;
		int sum=0;
		for(i=n;i<=100;i=i+1){
		sum=sum+i;
		}
		System.out.print("sum="+sum);
	}

}
