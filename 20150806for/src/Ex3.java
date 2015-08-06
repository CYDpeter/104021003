import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int sum =0 ;
		for(int i=13;i<=1399;i=i+1){
			if(i%17 == 0){
				sum=sum+i;
			}
		}
		System.out.print("Sum="+sum);
	}

}
