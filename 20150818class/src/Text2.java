import java.util.Scanner;

public class Text2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入您有幾門課?");
		int n = scn.nextInt();
		Course cousData[] = new Course[n];
		for (int i = 0; i < n; i++) {
			System.out.print("請輸入課程名稱，編號與學分");
			cousData[i] = new Course(scn.next(), scn.next(), scn.nextInt());
			System.out.print("請輸入授課老師");
			cousData[i].setTeacher(scn.next());
		}
		String str = "Y";
		int x, z;
		while (str.equals("Y") || str.equals("y")) {
			System.out.println("功能項目");
			System.out.println("1:查授課老師名");
			System.out.println("2:列印課程資訊");
			x = scn.nextInt();
			switch (x) {
			case 1:
				System.out.print("您要查詢第幾門課?");
				z = scn.nextInt();
				System.out.println(cousData[z].getTitle() + "授課老師為" + cousData[z].getTeacher());
				break;
			case 2:
				System.out.print("您要查第幾門課?");
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
	private String cousTitle, cousID, cousDescription, cousLocation, cousTeacher, cousTime;
	private int cousPoint;

	public Course(String title, String id1, int point) {
		cousTitle = title;
		cousID = id1;
		cousPoint = point;
	}

	public void setTitle(String str) {
		cousTitle = str;
	}

	public String getTitle() {
		return cousTitle;
	}

	public void setID(String str) {
		cousID = str;
	}

	public String getID() {
		return cousID;
	}

	public void setDescription(String str) {
		cousDescription = str;
	}

	public String getDescription() {
		return cousDescription;
	}

	public void setTime(String str) {
		cousTime = str;
	}

	public String getTime() {
		return cousTime;
	}
	public void setLocation(String str) {
		cousLocation = str;
	}

	public String getLocation() {
		return cousLocation;
	}

	public void setTeacher(String str) {
		cousTeacher = str;
	}

	public String getTeacher() {
		return cousTeacher;
	}


	public void setPoint(int v1) {
		if (v1 > 0 && v1 < 4) {
			cousPoint = v1;
		} else {
			System.out.println("很抱歉您輸入的資料格式不正確");
		}
	}

	public int getPoint() {
		return cousPoint;
	}

	public void showInfo() {
		System.out.println(cousTitle + "(" + cousID + ")");
		System.out.println("學分數:" + cousPoint);
		System.out.println("授課教師:" + cousTeacher + "\n");

	}
}
