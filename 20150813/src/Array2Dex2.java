import java.util.Scanner;

public class Array2Dex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�Z�W���X�H");
		int n = scn.nextInt();// ��J�ϥΪ̧Ʊ��J�H�ƩM���
		float min = 100, Max = 0;
		float data[][] = new float[n][4];// �}�C�H�ϥΪ̿�J�d��h����
		String name[] = new String[n];// �H���H�ϥΪ̿�J�d��h����
		for (int i = 0; i < n; i++) {
			System.out.print("�п�J��" + (i + 1) + "��P�ǦW�r");
			name[i] = scn.next();
			System.out.print("�п�J�T�즨�Z");
			data[i][0] = scn.nextFloat();
			data[i][1] = scn.nextFloat();
			data[i][2] = scn.nextFloat();
			data[i][3] = (data[i][0] + data[i][1] + data[i][2]) / 3;
		} // ��J�����Ҧ��H�W�r�M���Z�M�ӤH������
		System.out.println("���Z��Ʀp�U:");
		for (int i = 0; i < n; i++) {
			System.out.println(name[i] + "\t" + data[i][0] + "\t" + data[i][1] + "\t" + data[i][2] + "\t" + data[i][3]);
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (data[i][3] < 60) {
				System.out.println(name[i] + "���ή�");
				count++;
			}
		}
		System.out.println("���ή�H�� : "+count+" �H");
		for (int i = 0; i < n; i++) {
			if (data[i][3] < min) {
				min = data[i][3];				
			} else {
				if (data[i][3] > Max) {
					Max = data[i][3];
				}
			}
		}
		System.out.println("�̧C����" + min);
		System.out.println("�̰�����" + Max);
	}
}