import java.util.Arrays;

public class Bai_19{
	 public static int[] soLonNhatVaNhoNhat(int[] mang) {
		 Arrays.sort(mang);
		 int soLonNHat=mang[mang.length-1];
		 int soNhoNhat=mang[0];
		  int[] mangKetQua= {soNhoNhat,soLonNHat};
		  return mangKetQua;
	 } 
	 
}