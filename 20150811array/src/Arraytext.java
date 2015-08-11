import java.util.Scanner;
public class Arraytext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float[]data = new float[10];
		int v1 = 0,v2 = 0,v3 = 0;//v1統計過輕，v2統計剛好，v3統計異常
		float w,h,avg = 0.0f;
		for(int i=0;i<10;i++){
			System.out.print("請輸入第"+i+"位同學的身高和體重");
			h=scn.nextFloat();
			w=scn.nextFloat();
			data[i]=(float)(w/Math.pow((h/100),2));
			avg+=data[i];
			if(data[i]<18.5){
				v1++;
			}else{
				if(data[i]>=18.5&&data[i]<24){
					v2++;
				}else{
					v3++;
				}
			}
		}
		avg/=10;
		System.out.print("平均BMI值為"+avg);
		System.out.println("過輕，正常，過重比例分別為"+((float)v1/10.0)+",\t"+((float)v2/10.0)+",\t"+((float)v3/10.0));
		System.out.print("請輸入您要查詢的同學編號");
		int k = scn.nextInt();
		System.out.println("第"+k+"位同學BMI為"+data[k]);
	}

}
