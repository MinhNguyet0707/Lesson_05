
public class Bai_07 {
public static void kiemTraMangDoiXung(int[] mang) {
	  int n = mang.length;
	  int kt = 1;	         
	    for (int i = 0; i < n / 2; i++) {
	        if (mang[i] != mang[n - i - 1]) {
	            kt = 0;
	            break;
	        }
	    }
	         
	    if (kt == 0) {
	        System.out.println("Mảng vừa nhập không là mảng đối xứng");
	    } else {
	        System.out.println("Mảng  vừa nhập là mảng đối xứng");
	    }
	}
}
