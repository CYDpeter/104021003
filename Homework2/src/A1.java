import java.util.Scanner;

import javax.swing.Spring;
public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�W�r");
		String name = scn.next();
		System.out.println("Hi,"+name+"�A�n,�w��Ө�Ȥj");
		System.out.print("�п�J¾�~");
		String work = scn.next();
		System.out.println("�z��,"+work+"�A�n�F�`��");
		System.out.print("�z������O�ƻ�O?");
		String interest = scn.next();
		System.out.println("�����A"+interest+"�n���@~��ڤ@�ˣ�");
		System.out.print("�z�Ӧۭ��̩O?");
		String from = scn.next();
		System.out.println("����,"+from+"�O�Ӧn�a��O~");
		System.out.print("���̲{�b�j�����X�שO?(�·е��ڭӤj���Ʀr)");
		Float c = scn.nextFloat();
		Float f = c*9/5+32;
		System.out.println("�ؤ�"+f+"�ګܼF�`��XD");
		System.out.print("�аݱz���P�y�O?");
		String constellation = scn.next();
		System.out.println("�����d!?"+constellation+"�ڳ̷R���ӬP�y�F!");
		System.out.print("�л��A��");
		String bye = scn.next();
		System.out.println(bye+"�A�]���ڲ֤FXD �A��");
	}

}