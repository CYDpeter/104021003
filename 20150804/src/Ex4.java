import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入月份");
		int m = scn.nextInt();
		System.out.print("請輸入日期");
		int d = scn.nextInt();
		if(m==1&&d>=20||m==2&&d<=18){
			System.out.print("水瓶座 有冒險精神");
		}else{
			if(m==2&&d>=19||m==3&&d<=20){
				System.out.print("雙魚座 忠厚老實");
			}else{
				if(m==3&&d>=21||m==4&&d<=19){
					System.out.print("牡羊座  堅強");
				}else{
					if(m==4&&d>=20||m==5&&d<=20){
						System.out.print("金牛座 穩定慎重");
					}else{
						if(m==5&&d>=21||m==6&&d<=21){
							System.out.print("雙子座 敏銳富有觀察力");
						}else{
							if(m==6&&d>=22||m==7&&d<=22){
								System.out.print("巨蟹座 感情豐富");
							}else{
								if(m==7&&d>=23||m==8&&d<=22){
									System.out.print("獅子座 可靠");
								}else{
									if(m==8&&d>=23||m==9&&d<=22){
										System.out.print("處女座 純潔有正義感");
									}else{
										if(m==9&&d>=23||m==10&&d<=22){
											System.out.print("天枰座 平凡快樂");
										}else{
											if(m==10&&d>=23||m==11&&d<=21){
												System.out.print("天蠍座 有耐力");
											}else{
												if(m==11&&d>=22||m==12&&d<=21){
													System.out.print("射手座 坦白直率");
												}else{
													if(m==12&&d>=22||m==1&&d<=19){
														System.out.print("魔羯座 腳踏實地");
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
