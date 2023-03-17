import OOP.Circle;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import OOP.Date;
import StringTutorial.Person;
public class Main {
	public static void main(String[] args) {
//		String s1 = "17T1021001|Nguyen Van|Tuan|01/01/1995|TT Hue|1|Da Nang";
//		Person p = Person.parse(s1);
//		System.out.print(p.toString());
		 //tao 1 doi tuong file
		//boc 1 doan code co kha nang sinh ra loi 
		try {
			File file = new File("D:\\sinhvien.txt");
			Scanner scanner = new Scanner(file);
			ArrayList<String> ls = new ArrayList<>();
			while(scanner.hasNext()) {
				ls.add(scanner.nextLine());
//				String s = scanner.nextLine();
//				System.out.println(s);
			}
			ArrayList<Person> rs = Person.parse(ls);
			for (Person person : rs) {
				System.out.println(person.toString());
			}
//			List<Person> rs = Person.parse(ls);
			scanner.close();
//			System.out.println("Doc file thanh cong!");
		} 
		catch (FileNotFoundException e) {
			System.out.println("Loi khong tim thay file!");
			e.printStackTrace();
		} 
		catch(Exception e) {
			System.out.println("Loi khong xac dinh!");
			e.printStackTrace();
		}
		
	}
	static void Circle() {
		
		Circle c = new Circle();
		Circle c1 = new Circle(2.3);
//		System.out.print(c.getArea() + " " + c1.getArea());
		System.out.printf("%.4f",c1.getArea());
	}
	static void Date() {
		int a = 3;
		int b =7;
		int c = 2003;
		Date d = new Date(a,b,c);
		Date d1 = new Date(2,4,2003);
		System.out.println(d1.toString());
	}

	static void OOP() {
		Point p = new Point();
		System.out.print("Toa do P la: " + p.toString());
		Point p2 = new Point(5, 10);
		System.out.println("\nToa do P2 la: " + p2.toString());
		//khoi toa sao chep (gan toa do p2 cho p3)
		Point p3 = new Point(p2);
		System.out.println("Toa do P3 la: " + p3.toString());
		
		double pp2 = p.Distance2(p2);
		System.out.println("Khoang cach tu P toi P2: " + pp2);
		//ham static
		double p2p = Point.Distance3(p, p2);
		System.out.print("Khoang cach tu P2 toi P: " + p2p);
		
		
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
		System.out.printf("%-6s%s\n", "[11]", "Min, max, average cua mang");
		System.out.printf("%-6s%s\n", "[12]", "Tong cac phan tu trong mang");
		System.out.printf("%-6s%s\n", "[13]", "Tong cac so nguyen to trong mang");
	
	}
	static void Basic() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		boolean flag = true;
		int a,b,c,n;
		float[] a1 = {1,2,3,4,5,6};
		float b1[];
		b1 = new float[3];
		b1[0] = 1;
		b1[1] = 5;
		b1[2] = 8;
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
				System.out.printf("Giai thua cua %d: %d\n", gt, B2.giaiThua(gt));
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
			case 11:
				float newArr[] = BTMang.MinMaxAve(a1);
				System.out.print("\nMang min, max, average: " + Math.round(newArr[0]*100)/100 + " " + Math.round(newArr[1]*100)/100 + " " + Math.round(newArr[2]*100)/100);
				break;
			case 12:
				float sB = BTMang.Tong(b1);
				System.out.print("\nTong cua mang B: " + Math.round(sB*100)/100);
				break;
			case 13:
				float sumNT = BTMang.TongNguyenTo(b1);
				System.out.println("Tong cac so nguyen to trong mang: " + Math.round(sumNT*100)/100);
				break;
			default:
				flag = false;
				break;
			}
			
		}while(flag);
	}
}
