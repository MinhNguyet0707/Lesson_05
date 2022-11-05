import java.util.Arrays;

public class Bai_05 {
public static int soLonThuHai(int[] mang) {
	 Arrays.sort(mang);
	 int sLPT= mang.length;
	return mang[sLPT-2];
}


}
