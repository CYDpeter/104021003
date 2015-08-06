import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入最短邊");
		int a = scn.nextInt();
		System.out.print("請輸入第二長邊");
		int b = scn.nextInt();
		System.out.print("請輸入最長邊");
		int c = scn.nextInt();
		if(a*a+b*b<c*c){
		System.out.print("此為鈍角三角形");
		}else{
			if(a*a+b*b==c*c){
				System.out.print("此為直角三角形");
			}else{
				if(a*a+b*b>c*c){
					System.out.print("此為鈍角三角形");
					
				}
			}
		}
	}

}
