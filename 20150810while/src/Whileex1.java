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
		System.out.print("�U��"+(m+3)+"�I�A�o�Ӯɶ���F�j�󵥩���� �{�b���쬰"+k);
	}

}
