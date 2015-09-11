import java.util.Scanner;
public class Lf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String[] Enn = { "C", "C#", "D", "D#", "E", "F", "F#", 
				"G", "G#", "A", "A#", "B" };
		int[] Major = { 0, 4, 7 };
		int[] Minor = { 0, 3, 7 };
		int Times = scn.nextInt();
		int times = 0;
		while (times < Times) {
			String str = scn.next();
			char[] data = str.toCharArray();
			boolean jujge = true;
			for (int i = 0; i < data.length; i++) {
				if (data[i] == 'm') {
					jujge = false;
				}
			}
			if (jujge) {
				func(data, Major, Enn);
			}else{
				func(data, Minor, Enn);
			}
			times++;
		}
	}
	public static void func( char [] da, int [] data, String [] sdata){
		for (int i = 0; i < sdata.length; i++) {
			String s = String.valueOf(da[0]);
			if (s.equals(sdata[i])) {
				for (int j = 0; j < data.length; j++) {
					if ((i + data[j]) >= 12) {
						System.out.print(sdata[(i + data[j]) - 12] + " ");
					} else {
						System.out.print(sdata[i + data[j]] + " ");
					}
				}
			}
		}
		System.out.println();
	}
}
