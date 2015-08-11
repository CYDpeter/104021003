import java.util.Scanner;
import java.util.Random;

public class Arrayex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int count = 0;
		int[] data = new int[10];
		for (int i = 0; i < 10; i++) {
			data[i] = (rnd.nextInt(100) + 1);
			if (data[i] % 2 == 0) {
				count++;
			}
		}
		int j = 0;
		while (j < 3) {
			if (j == 0) {
				System.out.println("有幾個偶數");
			}
			int k = scn.nextInt();
			if (k == count) {
				j = 3;
				System.out.print("恭喜猜對");
			} else {
				if (j < 2) {
					System.out.println("請繼續輸入");
				} else {
					System.out.println("失敗");
				}
				j++;
			}
		}
		System.out.println("偶數有" + count + "個");
		for (int i = 0; i < 10; i++) {
			System.out.println(data[i]);
		}
	}
}