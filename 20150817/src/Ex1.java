import java.util.Random;
import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int n = 1000-rnd.nextInt(1000);
		System.out.println("要找回"+n+"元");
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
		System.out.println("應找回，"+v1+"張500，"+v2+"張100，"+v3+"個50塊，"+v4+"個10塊，"+v5+"個5塊，"+v6+"個1塊");
	}

}
