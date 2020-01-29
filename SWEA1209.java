import java.util.Scanner;

public class SWEX1209 {
	public static void main(String[] args) {
		int T = 10;
		Scanner sc = new Scanner(System.in);
		while(T--!=0) {
			int[][] arr = new int[100][100];
			int tt = sc.nextInt();
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int[] width = new int[100];
			int[] height = new int[100];
			int[] diagonal = new int[2];
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					width[i] += arr[i][j];
					height[j]+=arr[i][j];
					if (i==j) {
						diagonal[0]+=arr[i][j];
					}
					else if(i+j==99) {
						diagonal[1]+=arr[i][j];
					}
				}
			}
			
			int max = 0;
			for (int i = 0; i < 100; i++) {
				max = Math.max(max, width[i]);
				max = Math.max(max, height[i]);
			}
			for (int i = 0; i < diagonal.length; i++) {
				max = Math.max(max, diagonal[i]);
			}
			
			System.out.println("#"+tt+" "+max);
		}
	}
}
