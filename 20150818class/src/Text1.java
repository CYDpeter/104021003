public class Text1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human jack = new Human("K123456789", "王大頭");
		Human david = new Human("K123456789", "張飛");
		Human kevin = new Human("K123456789", "趙雲");
		jack.setHeight(170);
		david.setWeight(68);
		System.out.println("拜託kevin計算192/68的結果為" + kevin.compute(192, 65, '/'));
		System.out.println("david的體重是:" + david.getWeight());
		System.out.println("jack的身高是:" + jack.getHeight());
	}
}

class Human {

	private float height;
	private float weight;
	private String name;
	private String skinColo;
	private String id;

	public Human(String id1, String name1) {
		name = name1;
		id = id1;
	}

	public void setHeight(float h) {
		height = h;
	}

	public float getHeight() {
		return height;
	}

	public void setWeight(float w) {
		weight = w;
	}

	public float getWeight() {
		return weight;
	}

	public float compute(float v1, float v2, char op) {
		float result = 0.0f;
		switch (op) {
		case '+':
			result = v1 + v2;
			break;
		case '-':
			result = v1 - v2;
			break;
		case '*':
			result = v1 * v2;
			break;
		case '/':
			result = v1 / v2;
			break;
		}
		return result;
	}
}
