import java.util.Scanner;
public class Forex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		for(int i=13;i<=1399;i=i+2){
			sum =sum+i;
		}
		System.out.print("Sum="+sum);
	}

}
