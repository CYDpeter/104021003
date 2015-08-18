import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�z���X�i�o��?");
		int n = scn.nextInt();
		Course cousData[] = new Course[n];
		for (int i = 0; i < n; i++) {
			System.out.print("�п�J�a�}�A�q�ܻP�ǯu");
			cousData[i] = new Course(scn.next(), scn.next(), scn.nextInt());
			System.out.print("�п�J���a�W");
			cousData[i].setName(scn.next());
		}
		String str = "Y";
		int x, z;
		while (str.equals("Y") || str.equals("y")) {
			System.out.println("�\�ඵ��");
			System.out.println("1:�d���a�W");
			System.out.println("2:�C�L�o����T");
			x = scn.nextInt();
			switch (x) {
			case 1:
				System.out.print("�z�n�d�߲ĴX�i�o��?");
				z = scn.nextInt();
				System.out.println(cousData[z].getAddress() + "���a�W��" + cousData[z].getName());
				break;
			case 2:
				System.out.print("�z�n�d�ĴX�i�o��?");
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
			System.out.println("�ܩ�p�z��J����Ʈ榡�����T");
		}
	}

	public int getFax() {
		return cousFax;
	}

	public void showInfo() {
		System.out.println(cousAddress + "(" + cousPhone + ")");
		System.out.println("�ǯu���X:" + cousFax);
		System.out.println("���W:" + cousName + "\n");

	}
}
