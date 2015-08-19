import java.util.Scanner;

public class Ex1change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入有幾樣商品");
		int total = scn.nextInt();
		Course3 cousData[] = new Course3[total];
		for (int i = 0; i < total; i++) {
			System.out.print("請輸入商品名稱，個個數量和價格");
			cousData[i] = new Course3(scn.next(), scn.next(), scn.nextInt());
		}
		String str = "Y";
		int x, z;
		while (str.equals("Y") || str.equals("y")) {
			System.out.println("功能項目");
			System.out.println("1:查商品名");
			System.out.println("2:列印發票資訊");
			x = scn.nextInt();
			switch (x) {
			case 1:
				System.out.print("您要查詢第幾樣商品?");
				z = scn.nextInt();
				System.out.println("商品名為" + cousData[z].getName() + "有" + cousData[z].getNumber() + "個");
				break;
			case 2:
				System.out.print("您要查詢第幾樣商品?");
				z = scn.nextInt();
				cousData[z].showInfo();
				break;
			default:
				System.out.println("無此功能!!");
			}
			System.out.print("是否繼續?(Y/n)");
			str = scn.next();
		}
		System.out.println("謝謝使用本系統");

	}

}

class Course3 {
	private String cousName,cousNumber;
	private int cousMoney;

	public Course3(String Name, String Number, int Money) {
		cousName = Name;
		cousNumber = Number;
		cousMoney = Money;
	}

	public void setName(String str) {
		cousName = str;
	}

	public String getName() {
		return cousName;
	}

	public void setNumber(String str) {
		cousNumber = str;
	}

	public String getNumber() {
		return cousNumber;
	}

	public void setMoney(int v2) {
		if (v2 > 0 && v2 < 999) {
			cousMoney = v2;
		} else {
			System.out.println("很抱歉您輸入的資料格式不正確");
		}
	}

	public int getMoney() {
		return cousMoney;
	}

	public void showInfo() {
		System.out.println("品名" + cousName);
		System.out.println("數量:" + cousNumber);
		System.out.println("價格:" + cousMoney + "\n");
	}
}
