import java.util.Scanner;
import java.util.Random;

public class Extext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int[] data = new int[100];
		int i = 0, j = 0, k = 0;
		for (i = 0; i < 100; i++) {
			data[i] = rnd.nextInt(100) + 1;
			for (j = 0; j < i; j++) {
				if (data[i] == data[j]) {
					i--;
					break;
				}
			}
		}
		for (i = 0; i < 100; i++) {
			for(j=i+1;j<100;j++){
			if (data[i] > data[j]) {
				int v1 = data[i];
				data[i] = data[j];
				data[j] = v1;
			}
			}
		}
		for (i = 0; i <100; i++) {
			System.out.println(data[i]);
		}
	}
}
