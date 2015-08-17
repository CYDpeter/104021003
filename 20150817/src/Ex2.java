import java.util.Scanner;
import java.util.Random;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int n = rnd.nextInt(1000)+1;
		int v1 = n/1000;
		n = n%1000;
		int v2 = n/100;
		n = n%100;
		int v3 = n/10;
		n = n%10;
		int v4 = n/1;
		n = n%1;
		System.out.println("價格為"+v1+"仟"+v2+"佰"+v3+"拾"+v4+"元");
	}

}
