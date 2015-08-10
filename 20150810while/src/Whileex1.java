import java.util.Scanner;
public class Whileex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = 1;
		float k = 20000;
		while(k<1100000){//500-(500*75%)=1100000
			
			k = (float)((int)k+k*1.002);
			m++;
		}
		System.out.print("下午"+(m+3)+"點，這個時間到達大於等於水位 現在水位為"+k);
	}

}
