import java.util.Scanner;
public class Arrayex1 {//���D���N�ҿ�J���r���ۤϱƦC

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);//�ŧi�ܼ�scn��Scanner���\��
		String str = scn.nextLine();//�r���ܼ�str��J�ܼƫ�[next()�����ť���ɰ���Anextline()������Ҧ���J�]�A�ťի�]
		char [] data = str.toCharArray();//�r���}�C=�N�r���ন�r���}�C
		for(int i=data.length-1;i>=0;i--){//for�j�餤����ҿ�J���r���}�C����-1;����ɭn�j�󵥩�0;����
			System.out.print(data[i]);//��ܩҨD���}�C
		}
	}

}
