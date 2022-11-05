import java.util.Scanner;

public class Bai_16 {
public static void soChanLe() {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("nhap n");
	n=sc.nextInt();
	if(n<=0) {
		System.out.println("nhap lại");
	}else {
		System.out.println("in ra cac so chăn");
		for(int i=0;i<n;i+=2) {
			System.out.println(i);
		}
		System.out.println("in so lẻ");
		for(int i = 1; i < n; i += 2) {
			System.out.println(i);
		}
	}
	
}
}
