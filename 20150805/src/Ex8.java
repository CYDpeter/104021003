import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("½Ð¿é¤J¦¨ÁZ");
		float a = scn.nextFloat();
		if(a>97){
			System.out.print("A+");
		}else{
			if(a<=97&&a>=94){
			System.out.print("A");
		}else{
			if(a<=93&&a>=90){
			System.out.print("A-");
			}else{
				if(a<=89&&a>=87){
				System.out.print("B+");
				}else{
					if(a<=86&&a>=84){
					System.out.print("B");
					}else{
						if(a<=83&&a>=80){
						System.out.print("B-");
						}else{
							if(a<=79&&a>=77){
							System.out.print("C+");
							}else{
								if(a<=76&&a>=74){
								System.out.print("C");
								}else{
									if(a<=73&&a>=70){
									System.out.print("C-");
									}else{
										if(a<=69&&a>=67){
										System.out.print("D+");
										}else{
											if(a<=66&&a>=64){
											System.out.print("D");
											}else{
												if(a<=63&&a>=60){
												System.out.print("D-");
												}else{
													if(a<60){
													System.out.print("E");
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
}
