import java.util.Scanner;
public class Arrayex1 {//此題為將所輸入之字成相反排列

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);//宣告變數scn有Scanner的功能
		String str = scn.nextLine();//字串變數str輸入變數後[next()為抓到空白鍵時停止，nextline()為抓取所有輸入包括空白建]
		char [] data = str.toCharArray();//字元陣列=將字串轉成字元陣列
		for(int i=data.length-1;i>=0;i--){//for迴圈中執行所輸入之字元陣列長度-1;執行時要大於等於0;遞減
			System.out.print(data[i]);//顯示所求之陣列
		}
	}

}
