import java.util.Scanner;
public class BTMang {
	/**
	 * Tinh tong cac phan tu trong mang
	 * @param mang Mang can tinh tong
	 * @return Tong cac phan tu mang
	 */
	public static float Tong(float[] mang) {
		int n = mang.length;
		float sum = 0;
		for (int i=0; i<n; i++) {
			sum += mang[i];
		}
		return sum;
	}
	/**
	 * Tim min, max, average cua cac so trong mang
	 * @param mang Mang dau vao
	 * @return Mang luu 3 gia tri min, max, average
	 */
	public static float[] MinMaxAve(float[] mang) {
		float mma[] = new float[3];
		mma[0] = min(mang);
		mma[1] = max(mang);
		mma[2] = average(mang);
		return mma;
		
	}
	static float min(float[] mang) {
		int n = mang.length;
		float m = mang[0];
		for (int i=1; i<n ;i++) {
			if (mang[i]>m) {
				m = mang[i];
			}
		}
		return m;
	}
	static float max(float[] mang) {
		int n = mang.length;
		float m = mang[0];
		for (int i=1; i<n ;i++) {
			if (mang[i] < m) {
				m = mang[i];
			}
		}
		return m;
	}
	static float average(float[] mang) {
		int n = mang.length;
		float ave = 0;
		float sum = 0;
		for (int i=0;i<n;i++) {
			sum += mang[i];
		}
		ave = sum / n;
		return ave;
	}
	/**
	 * Tong cac so nguyen to trong mang
	 * @param mang Mang dau vao
	 * @return Tong cac so nguyen to trong mang
	 */
	public static float TongNguyenTo(float[] mang) {
		int n = mang.length;
		float s = 0;
		for (int i=0;i<n;i++) {
			if(B5.ktSNT(mang[i]))
				s += mang[i];
		}
		return s;
	}
	/**
	 * Nhap Ma Tran
	 */
	public static int[][] congMaTran(int matran1[][], int matran2[][]) {
		int matran[][] = new int[matran1.length][matran1[0].length];
		for (int i=0; i<matran1.length; i++) {
			for (int j=0; j< matran1[i].length; j++) {
				matran[i][j] = matran1[i][j] + matran2[i][j];
			}
		}
		return matran;
	}
	public static void nhapMang(int matran[][]) {
		Sccaner nhapDuLieu = new Scanner(System.in);
		for (int i = 0; i< matran.length;i++) {
			for (int j=0; j< matran[i].length; j++) {
				System.out.print(String.format("Phan tu thu [%d, %d]: ", i+1, j+1));
				matran[i][j] = nhapDulieu.nextIn();
			}
		}
	}

	
}