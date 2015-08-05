import java.util.Scanner;
public class Eat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入今天星期幾");
		int D = scn.nextInt();
		System.out.print("請輸入今天的日期");
		int d = scn.nextInt();
		if(d==7||d==17||d==27){
		System.out.print("今天不吃素");
		}else{
			if(D==2||D==4||D==6){
				System.out.print("今天吃素");

			}
				}
			}
		
}
