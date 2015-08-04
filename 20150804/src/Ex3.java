import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入身高(公分)");
		float h = scn.nextFloat();
		System.out.print("請輸入體重(公斤)");
		float w = scn.nextFloat();
		if(h>165&&w<45){
		System.out.print("請追求");
		}else{
			if(h<=165&&w>=45){
				System.out.print("請考慮考慮");
			}
		}
	}

}
