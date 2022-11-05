import java.util.Scanner;

public class Bai_14 {
public static void TinhTong() {
	Scanner sc = new Scanner(System.in);
	System.out.println("nhap n");
	double n= sc.nextDouble();
 double S=1;
	for (int i = 2; i <=n; i++) {
		 S = S+(double)1/i;
	}
	System.out.println(S);
}
}
