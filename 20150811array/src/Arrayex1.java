import java.util.Scanner;
import java.util.Random;

public class Arrayex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int count = 0;//�q0�}�l
		int[] data = new int[10];//�n10���ܼ�
		for (int i = 0; i < 10; i++) {//�q0�}�l��9�@10�ò֥[
			data[i] = (rnd.nextInt(100) + 1);//1-100�q���H����
			if (data[i] % 2 == 0) {//���p�H���ƳQ2�㰣
				count++;//�䧹�@�ӫ��~��U�@��
			}
		}//������H���䧹10�ӫ᩹�U��
		int j = 0;//�]j����ƨñq0�}�l
		while (j < 3) {//while�j��j��3��(0~2)
			if (j == 0) {//���pj��0��
				System.out.println("���X�Ӱ���");//����D��
			}
			int k = scn.nextInt();//�]k����Ƭ��ϥΪ̿�J
			if (k == count) {//���pk=�üƤ����X�Ӱ���
				j = 3;//����j=3
				System.out.print("���߲q��");//��ܲq��õ����j��
			} else {//�Y�S�q��
				if (j < 2) {//���pj=��0��1(�ĤG���q��0�ĤT���q��1)
					System.out.println("���~���J");//��ܽ��~���J
				} else {//�Y3�����S��
					System.out.println("����");//��ܥ���
				}
				j++;//�q���N�@������j<3(3��)
			}
		}//�q���T�������j��
		System.out.println("���Ʀ�" + count + "��");//���\�M���ѳ���ܦ@���X���H������
		for (int i = 0; i < 10; i++) {//�q0�}�l��9�@10�ò֥[
			System.out.println(data[i]);//��ܩҦ��H���ü�
		}
	}
}