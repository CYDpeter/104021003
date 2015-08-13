import java.util.Scanner;

public class Arrry2Dtext2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入行(row)和列(column)");
		int n = scn.nextInt();//整數行的變數值
		int m = scn.nextInt();//整數列的變數值
		int k = 1;//我要第一數從1開始
		int data[][] = new int[n][m];//我的2維陣列為我輸入的n m所出現的行列
		for (int j = 0; j < m; j++) {//迴圈中整數j列從0開始小於m列值j遞增
			if (j % 2 == 0) {//假如j列為偶數列
				for (int i = 0; i < n; i++) {//迴圈中i行從0開始小於n行值i遞增
					data[i][j] = k;//2維陣列為k
					k++;//k+1後從頭迴圈
				}
			} else {//若不是偶數列(奇數列)
				for (int i = n - 1; i >= 0; i--) {//迴圈i行從n行-1開始遞減回去i大於等於0
					data[i][j] = k;///2維陣列為k
					k++;//k+1後從頭迴圈
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
