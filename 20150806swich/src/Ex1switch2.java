import java.util.Scanner;
public class Ex1switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入月份");
		int m = scn.nextInt();
		String str ="";//字串用法
		if(m>12||m<1){
			System.out.print("沒有這個月分!");
		}else{
			switch(m){
			case 1 :
				str = "January";break;
			case 2 :
				str ="February";break;
			case 3 :
				str ="March";break;
			case 4 :
				str ="April";break;
			case 5 :
				str ="May";break;
			case 6 :
				str ="June";break;
			case 7 :
				str ="July";break;
			case 8 :
				str ="August";break;
			case 9 :
				str ="September";break;
			case 10 :
				str ="October";break;
			case 11 :
				str ="November";break;
			case 12 :
				str ="December";break;
			}
			System.out.print(m+"月份英文為"+str);
		}
	}

}
