import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J����(����)");
		float h = scn.nextFloat();
		System.out.print("�п�J�魫(����)");
		float w = scn.nextFloat();
		if(h>165&&w<45){
		System.out.print("�аl�D");
		}else{
			if(h<=165&&w>=45){
				System.out.print("�ЦҼ{�Ҽ{");
			}
		}
	}

}
