public class Text1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human jack = new Human("K123456789", "���j�Y");
		Human david = new Human("K123456789", "�i��");
		Human kevin = new Human("K123456789", "����");
		jack.setHeight(170);
		david.setWeight(68);
		System.out.println("���Ukevin�p��192/68�����G��" + kevin.compute(192, 65, '/'));
		System.out.println("david���魫�O:" + david.getWeight());
		System.out.println("jack�������O:" + jack.getHeight());
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
