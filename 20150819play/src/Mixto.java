import java.util.Scanner;

public class Mixto {
	player players[];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("輸入玩家數");
		int num = scn.nextInt();
		players = new player[num];
		for (int i = 0; i < num; i++) {
			System.out.println("輸入money,LV,name");
			double money = scn.nextDouble();
			int LV = scn.nextInt();
			String name = scn.next();
			players[i] = new play(money, LV, name);
		}
		System.out.println("Total Money" + totalMoney());
		System.out.println("Max LV" + hLV());
	}

	public double totalMoney() {
		int num = players.length();
		double sum = 0;
		for (int i = 0; i < num; i++) {
			sum += players[i].getMoney();
		}
		return sum;
	}
	public class Player {
		
		private double money;
		private int LV;
		private String name;
		public void player(double m,int lv,String n){
			money = m;
			LV = lv;
			name = n;
		}
		public void setMoney(double m){
			money = m;
		}
		public double getMoney(){
			return money;
		}
		
		public void setLV(int lv){
			LV = lv;
		}
		public double getLV(){
			return LV;
		}
		
		public void setName(String n){
			name = n;
		}
		public double getName(){
			return name;
		}
	}

}

