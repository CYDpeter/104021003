import java.util.Scanner;
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("�Ʀr");
        long n =scn.nextLong();
        fun(n);
        
	}
        public static void fun(long v1){
        long sum = 0;
        String m=""+v1;
        int len = m.length();
        char[] a =m.toCharArray();
        for(int i=0;i<len;i++){
        	System.out.print(a[i]+" ");//��ܪ��r���}�C�[�W�ť�
        }
       
	}

}