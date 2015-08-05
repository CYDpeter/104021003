import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("輸入性別男生=1 女生=2");
		int A = scn.nextInt();
		System.out.print("輸入身高");
		int H = scn.nextInt();
		int W;
		if(A==1){
			 W = (H-170)*6/10+62;
			 System.out.print("標準體重="+W);
		}
	}

}
