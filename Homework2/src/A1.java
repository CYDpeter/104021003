import java.util.Scanner;

import javax.swing.Spring;
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入名字");
		String name = scn.next();
		System.out.println("Hi,"+name+"你好,歡迎來到亞大");
		System.out.print("請輸入職業");
		String work = scn.next();
		System.out.println("哇嗚,"+work+"你好厲害啊");
		System.out.print("您的興趣是甚麼呢?");
		String interest = scn.next();
		System.out.println("哈哈，"+interest+"好巧哦~跟我一樣ㄝ");
		System.out.print("您來自哪裡呢?");
		String from = scn.next();
		System.out.println("挖嗚,"+from+"是個好地方呢~");
		System.out.print("那裡現在大概攝氏幾度呢?(麻煩給我個大概數字)");
		Float c = scn.nextFloat();
		Float f = c*9/5+32;
		System.out.println("華氏為"+f+"我很厲害齁XD");
		System.out.print("請問您的星座是?");
		String constellation = scn.next();
		System.out.println("紅豆泥!?"+constellation+"我最愛那個星座了!");
		System.out.print("請說再見");
		String bye = scn.next();
		System.out.println(bye+"，因為我累了XD 再見");
	}

}