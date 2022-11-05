
public class Bai_04 {
public static int timSoLuongCapSoBangNhau(int[] mang) {

	int soCapBangNhau = 0;
	
	for (int i = 0; i < mang.length-1; i++) {
		if(mang[i]==mang[i+1]) {
			soCapBangNhau++;
		}
	}
	return soCapBangNhau;
}
}
