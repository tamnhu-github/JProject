import java.lang.Math;
public class B10 {
	static boolean checkFibonacci(int n) {
		int a = 5 * n * n + 4;
		int b = 5 * n * n - 4;
		double sqrt_a = Math.sqrt(a);
		double sqrt_b = Math.sqrt(b);
		return (sqrt_a * sqrt_a == a)  || (sqrt_b * sqrt_b == b);
	}
	static void lietKe(int n) {
		System.out.print("So Fibonacci nho hon n va la so nguyen to: ");
		for (int i=0; i<n ;i++) {
			if (B10.checkFibonacci(i) && B5.ktSNT(i))
				System.out.print(i + " ");
		}
		System.out.println("\n");
	}
}
