import java.util.Scanner;

public class Array2Dex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("班上有幾人");
		int n = scn.nextInt();// 輸入使用者希望輸入人數和科目
		float min = 100, Max = 0;
		float data[][] = new float[n][4];// 陣列隨使用者輸入範圍去執行
		String name[] = new String[n];// 人數隨使用者輸入範圍去執行
		for (int i = 0; i < n; i++) {
			System.out.print("請輸入第" + (i + 1) + "位同學名字");
			name[i] = scn.next();
			System.out.print("請輸入三科成績");
			data[i][0] = scn.nextFloat();
			data[i][1] = scn.nextFloat();
			data[i][2] = scn.nextFloat();
			data[i][3] = (data[i][0] + data[i][1] + data[i][2]) / 3;
		} // 輸入完成所有人名字和成績和個人平均後
		System.out.println("全班資料如下:");
		for (int i = 0; i < n; i++) {
			System.out.println(name[i] + "\t" + data[i][0] + "\t" + data[i][1] + "\t" + data[i][2] + "\t" + data[i][3]);
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (data[i][3] < 60) {
				System.out.println(name[i] + "不及格");
				count++;
			}
		}
		System.out.println("不及格人數 : "+count+" 人");
		for (int i = 0; i < n; i++) {
			if (data[i][3] < min) {
				min = data[i][3];				
			} else {
				if (data[i][3] > Max) {
					Max = data[i][3];
				}
			}
		}
		System.out.println("最低分為" + min);
		System.out.println("最高分為" + Max);
	}
}