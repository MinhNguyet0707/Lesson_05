import java.util.Arrays;
import java.util.Scanner;

public class Bai_20 {
	public static int[] chenMang(int[] mang) {
	Arrays.sort(mang);
	 Scanner sc = new Scanner(System.in);
	 System.out.println("nhap n");
	 int n =sc.nextInt();
	 int[] mangKetQua = new int[mang.length+1];
	for (int i = 0; i < mang.length; i++) {
		if(n>=mang[i]&&n<mang[i+1]) {
			for(int j = 0; j <=i; j++) {
				mangKetQua[j] = mang[i];
				mangKetQua[i+1] = n;
			for(int k = i+2;k < mangKetQua.length; k++) {
				mangKetQua[k] = mang[k-1];
			}	
			}
			
		}
	}
	 return mangKetQua;
	 	 
}
	
	public static void main(String[] args) {
		int[] mang = NhapMang.nhapMang();
		int[] mang2 = chenMang(mang);
		inMang.inMang(mang2);
	}
	
}
