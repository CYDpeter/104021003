import java.util.Scanner;
public class Forex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
			int sum = 0;
			for(int i=17;i<=1399;i=i+17){
				sum = sum+i;
			}
	System.out.print("Sum="+sum);
	}

}
