import java.util.Scanner;

public class Arrry2Dtext2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J��(row)�M�C(column)");
		int n = scn.nextInt();//��Ʀ檺�ܼƭ�
		int m = scn.nextInt();//��ƦC���ܼƭ�
		int k = 1;//�ڭn�Ĥ@�Ʊq1�}�l
		int data[][] = new int[n][m];//�ڪ�2���}�C���ڿ�J��n m�ҥX�{����C
		for (int j = 0; j < m; j++) {//�j�餤���j�C�q0�}�l�p��m�C��j���W
			if (j % 2 == 0) {//���pj�C�����ƦC
				for (int i = 0; i < n; i++) {//�j�餤i��q0�}�l�p��n���i���W
					data[i][j] = k;//2���}�C��k
					k++;//k+1��q�Y�j��
				}
			} else {//�Y���O���ƦC(�_�ƦC)
				for (int i = n - 1; i >= 0; i--) {//�j��i��qn��-1�}�l����^�hi�j�󵥩�0
					data[i][j] = k;///2���}�C��k
					k++;//k+1��q�Y�j��
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
