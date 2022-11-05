import java.util.Scanner;

public class NhapMang {
 public static int[] nhapMang() {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Nhap do dai mang n = :");
	 int n = sc.nextInt();
	 int[] mang = new int[n];	 
	 for (int i = 0; i <= mang.length-1; i++) {
		System.out.println("Nhap so o vi tri " + i);		
		mang[i] = sc.nextInt();		
	}
	 return mang;
	 
	 
 
}
}
