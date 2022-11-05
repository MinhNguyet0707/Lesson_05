import java.util.Arrays;

public class Bai_09 {
public static void inRACacSoKhacNhau(int[] Mang) {
	Arrays.sort(Mang);
	for (int i = 0; i < Mang.length-1; i++) {
			if(Mang[i]!=Mang[i+1]) {
				System.out.print(+Mang[i]);
			}
	if(Mang[Mang.length-1]!=Mang[Mang.length-2]) {
			System.out.print(Mang[Mang.length-1]);
		}
		
	}
}
}
	 


