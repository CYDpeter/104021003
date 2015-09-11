import java.util.Scanner;
import java.util.ArrayList;
public class Lf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList <Integer> arr = new ArrayList<Integer>();
		int num = scn.nextInt();
		int n = 0;
		while(n<num){
			int p = scn.nextInt();
			for(int i=0;i<p;i++){
				arr.add(i+1);
			}
			int c = scn.nextInt();
			c--;
			int start = 0;
			while(arr.size() != 1){
				start+=c;
				if(start>=arr.size()){
					start-=arr.size();
				}
				arr.remove(start);
			}
			System.out.println(arr.get(0));
			n++;
		}
	}

}
