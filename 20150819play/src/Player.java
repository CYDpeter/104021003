public class Player {
	
		private double money;
		private int LV;
		private String name;
		public player(double m,int lv,String n){
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
			Name = n;
		}
		public double getName(){
			return Name;
		}
	}

}
