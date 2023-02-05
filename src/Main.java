import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		int a,b,c,n;
		do {
			Menu();
			System.out.print("Nhap lua chon: ");
			int luachon = input.nextInt();
			switch(luachon) {
			case 1:
				System.out.print("Nhap a: ");
				a = input.nextInt();
				System.out.print("Nhap b: ");
				b = input.nextInt();
				System.out.print("Nhap c: ");
				c = input.nextInt();
				B1.ptBacHai(a, b, c);
				break;
			case 2: 
				System.out.print("Nhap n: ");
				int gt = input.nextInt();
				System.out.printf("Giai thua cua %d: %d", gt, B2.giaiThua(gt));
				break;
			case 3:
				System.out.print("Nhap n: ");
				n = input.nextInt();
				System.out.printf("So Fibonacci thu %d: %d\n",n,B3.Fibonacci(n));
				break;
			case 4:
				System.out.print("Nhap a: ");
				a = input.nextInt();
				System.out.print("Nhap b: ");
				b = input.nextInt();
				System.out.printf("Uoc chung lon nhat cua %d va %d: %d",a,b,B4.UCLN(a, b));
				System.out.printf("\nBoi chung nho nhat cua %d va %d: %d\n",a,b,B4.BCNN(a, b));
				break;
			case 5:
				System.out.print("Nhap n: ");
				n = input.nextInt();
				System.out.printf("Cac so nguyen to nho hon %d: ",n);
				B5.lietkeSNT(n);
				break;
			case 6:
				System.out.print("Nhap n: ");
				n = input.nextInt();
				System.out.printf("\n%d so nguyen to dau tien: ", n);
				B6.SNT2(n);
				break;
			case 7:
				System.out.print("Cac so nguyen to co 5 chu so: ");
				B7.SNT3();
				break;
			case 8:
				System.out.println("Nhap n: ");
				n = input.nextInt();
				System.out.printf("Tong cac chu so cua %d: %d\n",n, B8.tongChuSo(n));
				break;
			case 9:
				B9.thuannghich();
				break;
			case 10:
				System.out.print("Nhap n: ");
				n = input.nextInt();
				B10.lietKe(n);
				break;
			default:
				flag = false;
				break;
			}
			
		}while(flag);
	}
	static void Menu () {
		System.out.printf("%-6s%s\n", "[1]", "Phuong trinh bac hai");
		System.out.printf("%-6s%s\n", "[2]", "Giai thua");
		System.out.printf("%-6s%s\n", "[3]", "So Fibonacci");
		System.out.printf("%-6s%s\n", "[4]", "UCLN & BCNN");
		System.out.printf("%-6s%s\n", "[5]", "Liet ke cac so nguyen to nho hon n");
		System.out.printf("%-6s%s\n", "[6]", "Liet ke n so nguyen to dau tien");
		System.out.printf("%-6s%s\n", "[7]", "Liet ke cac so nguyen to co 5 chu so");
		System.out.printf("%-6s%s\n", "[8]", "Tong cac chu so cua mot so nguyen");
		System.out.printf("%-6s%s\n", "[9]", "So thuan nghich co 6 chu so");
		System.out.printf("%-6s%s\n", "[10]", "Liet ke cac so Fibonacci nho hon n la so nguyen to");
		
	}
	boolean LaChan(int n) {
		if (n % 2 == 0) {
			return true;
		}
		return false;
	}
}
