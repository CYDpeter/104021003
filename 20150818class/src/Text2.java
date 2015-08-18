import java.util.Scanner;

public class Text2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�z���X����?");
		int n = scn.nextInt();
		Course cousData[] = new Course[n];
		for (int i = 0; i < n; i++) {
			System.out.print("�п�J�ҵ{�W�١A�s���P�Ǥ�");
			cousData[i] = new Course(scn.next(), scn.next(), scn.nextInt());
			System.out.print("�п�J�½ҦѮv");
			cousData[i].setTeacher(scn.next());
		}
		String str = "Y";
		int x, z;
		while (str.equals("Y") || str.equals("y")) {
			System.out.println("�\�ඵ��");
			System.out.println("1:�d�½ҦѮv�W");
			System.out.println("2:�C�L�ҵ{��T");
			x = scn.nextInt();
			switch (x) {
			case 1:
				System.out.print("�z�n�d�߲ĴX����?");
				z = scn.nextInt();
				System.out.println(cousData[z].getTitle() + "�½ҦѮv��" + cousData[z].getTeacher());
				break;
			case 2:
				System.out.print("�z�n�d�ĴX����?");
				z = scn.nextInt();
				cousData[z].showInfo();
				break;
			default:
				System.out.println("�L���\��!!");
			}
			System.out.print("�O�_�~��?(Y/n)");
			str = scn.next();
		}
		System.out.println("���¨ϥΥ��t��");
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
			System.out.println("�ܩ�p�z��J����Ʈ榡�����T");
		}
	}

	public int getPoint() {
		return cousPoint;
	}

	public void showInfo() {
		System.out.println(cousTitle + "(" + cousID + ")");
		System.out.println("�Ǥ���:" + cousPoint);
		System.out.println("�½ұЮv:" + cousTeacher + "\n");

	}
}
