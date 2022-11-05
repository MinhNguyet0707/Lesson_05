
public class Bai_18 {
public static boolean ThuanNghich(int n) {
	int tg=n;
	int temp=0;
	while(n>0) {
		temp=temp*10+n%10;
		n/=10;
	}
	if(temp==tg) return true;
	return false;
	
}
public static void delay() {
	int count=0;
	for(int i=100000;i<=999999;i++) {
		if(ThuanNghich(i)) {
			if(count%10==0) 
				System.out.println(" ");
				count++;
				System.out.print(" "+i);
			}
		}
		
	}
	
}

