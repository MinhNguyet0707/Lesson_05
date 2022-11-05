import java.util.Iterator;
import java.util.Scanner;

public class Bai_10 {
	public static void nhapSoKhacNhau() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap mang n = :");
		int n = sc.nextInt();
		int[] mang = new int[n];
		int m = 0;
		
		System.out.println("Nhap phan tu: ");
		mang[0]=sc.nextInt();
		
		
		for (int i = 0; i < mang.length ; i++) {
			System.out.println("Nhap vao phan tu: ");
			int x = sc.nextInt();		
			if (mang[i] == x) {
			System.out.println("So da ton tai, vui long nhap lai");
				} else {
					m++;
				}
				mang[m] = x;

			}
		inMang.inMang(mang);
		}

	}


