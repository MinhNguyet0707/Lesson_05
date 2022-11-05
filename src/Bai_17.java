import java.util.Scanner;

public class Bai_17 {
public static void soNguyenToCUngNhau() {
	int m,n;
	Scanner sc = new Scanner(System.in);
	System.out.println("nhao m");
	m=sc.nextInt();
	System.out.println("nhao n");
	n=sc.nextInt();
	if(m > 0 && n > 0) {
		while(m != n) {
			if(m > n) {
				m = m - n;
			} else {
				n = n - m;
			}
		}
		if(m == 1) {
	System.out.println("Hai so nguyen to cung nhau");
		} else {
			System.out.println("ko phia hai nguyen to cung nhau");
		}
	} else {
	 System.out.println("Nhap hai so m, n > 0");
	}	
}
}
