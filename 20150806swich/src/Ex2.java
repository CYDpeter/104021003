import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�P��");
		int a = scn.nextInt();
		String str = "";
		if(a>7||a<1){
			System.out.print("�S���o�ӬP��");
		}else{
			switch(a){
			case 1 :
				str = "Monday";break;
			case 2 :
				str = "Tuesday";break;
			case 3 :
				str = "Wednesday";break;
			case 4 :
				str = "Thursday";break;
			case 5 :
				str = "friday";break;
			case 6 :
				str = "Saturday";break;
			case 7 :
				str = "Sunday";break;
			}
			System.out.print(a+"����^�嬰"+str);
		}
	}

}
