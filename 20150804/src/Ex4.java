import java.util.Scanner;
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J���");
		int m = scn.nextInt();
		System.out.print("�п�J���");
		int d = scn.nextInt();
		if(m==1&&d>=20||m==2&&d<=18){
			System.out.print("���~�y ���_�I�믫");
		}else{
			if(m==2&&d>=19||m==3&&d<=20){
				System.out.print("�����y ���p�ѹ�");
			}else{
				if(m==3&&d>=21||m==4&&d<=19){
					System.out.print("�d�Ϯy  ��j");
				}else{
					if(m==4&&d>=20||m==5&&d<=20){
						System.out.print("�����y í�w�V��");
					}else{
						if(m==5&&d>=21||m==6&&d<=21){
							System.out.print("���l�y �ӾU�I���[��O");
						}else{
							if(m==6&&d>=22||m==7&&d<=22){
								System.out.print("���ɮy �P���״I");
							}else{
								if(m==7&&d>=23||m==8&&d<=22){
									System.out.print("��l�y �i�a");
								}else{
									if(m==8&&d>=23||m==9&&d<=22){
										System.out.print("�B�k�y �¼䦳���q�P");
									}else{
										if(m==9&&d>=23||m==10&&d<=22){
											System.out.print("�Ѭi�y ���Z�ּ�");
										}else{
											if(m==10&&d>=23||m==11&&d<=21){
												System.out.print("���Ȯy ���@�O");
											}else{
												if(m==11&&d>=22||m==12&&d<=21){
													System.out.print("�g��y �Z�ժ��v");
												}else{
													if(m==12&&d>=22||m==1&&d<=19){
														System.out.print("�]�~�y �}���a");
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
