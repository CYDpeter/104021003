import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入您有幾張發票?");
		int n = scn.nextInt();
		Course cousData[] = new Course[n];
		for (int i = 0; i < n; i++) {
			System.out.print("請輸入地址，電話與傳真");
			cousData[i] = new Course(scn.next(), scn.next(), scn.nextInt());
			System.out.print("請輸入店家名");
			cousData[i].setName(scn.next());
		}
		String str = "Y";
		int x, z;
		while (str.equals("Y") || str.equals("y")) {
			System.out.println("功能項目");
			System.out.println("1:查店家名");
			System.out.println("2:列印發票資訊");
			x = scn.nextInt();
			switch (x) {
			case 1:
				System.out.print("您要查詢第幾張發票?");
				z = scn.nextInt();
				System.out.println(cousData[z].getAddress() + "店家名為" + cousData[z].getName());
				break;
			case 2:
				System.out.print("您要查第幾張發票?");
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

class Course {
	private String cousName,cousAddress,cousPhone;
	private int cousFax;
	
	public Course(String Address, String Phone1, int Fax) {
		cousAddress = Address;
		cousPhone = Phone1;
		cousFax = Fax;
	}
	
	public void setAddress(String str) {
		cousAddress = str;
	}

	public String getAddress() {
		return cousAddress;
	}
	
	public void setPhone(String str) {
		cousPhone = str;
	}

	public String getPhone() {
		return cousPhone;
	}
	
	public void setName(String str) {
		cousName = str;
	}

	public String getName() {
		return cousName;
	}
	
	public void setFax(int v1) {
		if (v1==10) {
			cousFax = v1;
		} else {
			System.out.println("很抱歉您輸入的資料格式不正確");
		}
	}

	public int getFax() {
		return cousFax;
	}

	public void showInfo() {
		System.out.println(cousAddress + "(" + cousPhone + ")");
		System.out.println("傳真號碼:" + cousFax);
		System.out.println("店名:" + cousName + "\n");

	}
}
