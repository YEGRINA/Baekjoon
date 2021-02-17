import java.util.Scanner;

public class Main {

	public static int n, m;
	public static int[] num = new int[8];
	public static boolean[] bool = new boolean[9];
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		f(0);
		
	}

	public static void f(int pos) {
		if(pos == m) {
			for(int i=0;i<m;i++) {
				System.out.print(num[i] + " ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			if(bool[i] == false) {
				num[pos] = i;
				bool[i] = true;
				f(pos + 1);
				bool[i] = false;
			}
		}
	}
	
}
