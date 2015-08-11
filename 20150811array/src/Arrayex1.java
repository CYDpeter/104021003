import java.util.Scanner;
import java.util.Random;

public class Arrayex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int count = 0;//從0開始
		int[] data = new int[10];//要10個變數
		for (int i = 0; i < 10; i++) {//從0開始到9共10並累加
			data[i] = (rnd.nextInt(100) + 1);//1-100從中隨機找
			if (data[i] % 2 == 0) {//假如隨機數被2整除
				count++;//找完一個後繼續下一個
			}
		}//執行到隨機找完10個後往下做
		int j = 0;//設j為整數並從0開始
		while (j < 3) {//while迴圈j做3次(0~2)
			if (j == 0) {//假如j為0時
				System.out.println("有幾個偶數");//顯示題目
			}
			int k = scn.nextInt();//設k為整數為使用者輸入
			if (k == count) {//假如k=亂數中有幾個偶數
				j = 3;//此時j=3
				System.out.print("恭喜猜對");//顯示猜對並結束迴圈
			} else {//若沒猜中
				if (j < 2) {//假如j=為0或1(第二次猜為0第三次猜為1)
					System.out.println("請繼續輸入");//顯示請繼續輸入
				} else {//若3次都沒中
					System.out.println("失敗");//顯示失敗
				}
				j++;//猜錯就一直做到j<3(3次)
			}
		}//猜錯三次結束迴圈
		System.out.println("偶數有" + count + "個");//成功和失敗都顯示共有幾個隨機偶數
		for (int i = 0; i < 10; i++) {//從0開始到9共10並累加
			System.out.println(data[i]);//顯示所有隨機亂數
		}
	}
}