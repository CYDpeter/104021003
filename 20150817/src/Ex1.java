import java.util.Random;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int n = 1000-rnd.nextInt(1000);
		System.out.println("�n��^"+n+"��");
		int v1 = n/500;
		n = n%500;
		int v2 = n/100;
		n = n%100;
		int v3 = n/50;
		n = n%50;
		int v4 = n/10;
		n = n%10;
		int v5 = n/5;
		n = n%5;
		int v6 = n/1;
		n = n%1;
		System.out.println("����^�A"+v1+"�i500�A"+v2+"�i100�A"+v3+"��50���A"+v4+"��10���A"+v5+"��5���A"+v6+"��1��");
	}

}
