
public class B2 {
	static long giaiThua(int n) {
		long  gt = 1;
		if (n == 0 || n == 1) {
			return gt;
		}
		else {
			for (int i = 2; i <=n ; i++) {
				gt *= i;
			}
			return gt;
		}
	}
}
