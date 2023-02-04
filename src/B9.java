
public class B9 {
	public static final int[] DEC_ARR_1_9 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	public static final int[] DEC_ARR_10 = {0,1,2,3,4,5,6,7,8,9};
	static void thuannghich() {
		int cnt = 0;
		StringBuilder sb;
		for (int a: DEC_ARR_1_9) {
			for (int b: DEC_ARR_10) {
				for (int c: DEC_ARR_10) {
					sb = new StringBuilder();
					sb.append(a).append(b).append(c).append(c).append(b).append(a);
					System.out.println(sb.toString());
					cnt++;
				}
			}
		}
		System.out.println("Tong cac so thuan nghich co 6 chu so: " + cnt);
	}
}
