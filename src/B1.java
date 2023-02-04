import java.lang.Math;
public class B1 {
	static void ptBacHai(int a, int b, int c) {
		if(a==0) {
			if(b==0) {
				if(c==0)
					System.out.println("Phuong trinh vo so nghiem");
				else System.out.println("Phuong trinh vo nghiem");
			}
			else System.out.println("Phuong trinh co nghiem duy nhat: " + (double)-c/b);
		}
		else {
			double delta = b*b - 4*a*c;
			if(delta > 0) {
				double x1 = (-b+Math.sqrt(delta))/(2*a);
				double x2 = (-b-Math.sqrt(delta))/(2*a);
				System.out.println("Nghiem thu nhat: x1 = " + (double) Math.round(x1*100)/100);
				System.out.println("Nghiem thu hai: x2 = " + (double) Math.round(x2*100)/100);
			}
			else if (delta == 0) 
				System.out.println("Phuong tirnh co nghiem kep: x1 = x2 = " + -b/2*a);
			else System.out.println("Phuong trinh vo nghiem");
		}
	}
}
