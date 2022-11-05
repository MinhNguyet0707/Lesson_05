
public class Bai_06 {
public static double tinhTrungBinhCong(int[] mang,int b, int c) {
	int Tong=0;
	for(int i=b; i<=c;i++) {
		Tong=Tong+mang[i];
	}
	double ketQua=Tong/(c-b+1);
	return ketQua;
}

}
