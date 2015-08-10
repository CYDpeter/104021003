import java.util.Scanner;
public class Forforex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int V1 = (int)(Math.ceil(n/2));
		int V2 = n-V1;
		for(int i=0;i<n;i++){
			System.out.println();
			for(int j=0;j<n-i-1;j++){
				System.out.print(" ");
			}
			for(int m=0;m<=2*i;m++){
				System.out.print("*");
			}
		}
		for(int i=n-2;i>=0;i--){
			System.out.println();
			for(int j=0;j<n-i-1;j++){
				System.out.print(" ");
			}
			for(int m=0;m<=2*i;m++){
				System.out.print("*");
			}
		}
	}
}