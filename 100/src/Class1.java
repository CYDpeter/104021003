import java.util.Scanner;
public class Class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn = new Scanner(System.in);
        System.out.println("輸入數字");
        long n =scn.nextLong();
        int sum =(int)fun(n);
        System.out.println("總和"+sum);
	}
        public static long fun(long v1){
        long sum = 0;
        String m=""+v1;
        int len = m.length();
        char[] a =m.toCharArray();
        for(int i=0;i<len;i++){
        	int c=a[i]-'0';
        sum+=c;	
        }
        return sum;
	}

}
