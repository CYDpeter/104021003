import java.util.Scanner;
public class Forforex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int V1 = (int)(Math.ceil((double)n/2));
		int V2 = n-V1;
		for(int i=0;i<V1;i++){
			for(int j=0;j<V1-i;j++){
				System.out.print(" ");
			}
			for(int m=0;m<=2*i;m++){
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=V2;i>0;i--){
			for(int j=V2-i+2;j>0;j--){
				System.out.print(" ");
			}
			for(int m=0;m<2*i-1;m++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}