import java.util.Scanner;
public class Arraytext1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] data = new int[12];
		for(int i=0;i<12;i++){
			System.out.print("�п�J��"+i+"���ЫǤW�ҤH��");
			data[i] = scn.nextInt();
		}
		System.out.print("�аݱz�n�ݭ������׽ҤH��?");
		int k = scn.nextInt();
		System.out.println("�Ы�"+k+"��"+data[k]+"�H�b�W��");
		for(int i=0;i<12;i++){
			if(data[i]<60){
				System.out.println("��"+i+"���u��"+data[i]+"�H");
			}
		}
	}

}
