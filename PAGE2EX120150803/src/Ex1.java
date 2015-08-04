import java.util.Scanner;
public class Ex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入名字");
		String name = scn.next();
		System.out.println("Hi,"+name+"你好,歡迎來到亞大");
		System.out.print("請輸入職業");
		String work = scn.next();
		System.out.println("哇嗚,"+work+"你好厲害啊");
	}

}
