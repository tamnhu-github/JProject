import java.lang.Math;
public class B5 {
	static boolean ktSNT(float n) {
		if (n < 2) return false;
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
	static void lietkeSNT(int n) {
		for (int i = 1; i < n; i++) {
			if (ktSNT(i))
				System.out.println("\n" + i);
		}
	}
}
