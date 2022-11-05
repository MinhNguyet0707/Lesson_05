
public class Bai_8 {
	
	public  static void timSoLanXuatHienNhieuNhat(int[] mang) {
		int n = mang.length;
		int m;
		int[] res;
		res= new int[n];
		for(int i=0;i<n;i++) {
			res[i]=-1;			
	}
		
	for (int i = 0; i < n; i++) {
			m=1;
			for(int j=i+1; j<n;j++) {
				if(res[j]!=0 && mang[i]==mang[j]) {
					m++;
					res[j]=0;
				}
			}
			if(res[i]!=0) {
				res[i]=m;
			}
		}
	int max=res[0];
	for(int i=0;i<n;i++) {
		if(res[i]>max) {
			max=res[i];
		}
	}
	
	System.out.println("so lan xuat hien nhieu nhat: " + res[0]);

}
	
	public static void main(String[] args) {
		
		
	}
}
