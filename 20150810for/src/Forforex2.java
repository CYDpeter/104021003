import java.util.Scanner;
public class Forforex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		int k = 1;
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				System.out.print(k+"\t");
				if(i%2==0){
					k=k+1;
				}else{
					k=k-1;
				}
	}System.out.println();
	if(i%2==0){
		k=k+m-1;
	}else{
		k=k+m+1;
	}
		}
}
}