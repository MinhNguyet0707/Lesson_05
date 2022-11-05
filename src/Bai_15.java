import java.util.Scanner;

public class Bai_15 {
public static void TinhTongChia7() {
	int n;
	long sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("nhap so nguyen ");
	n=sc.nextInt();
	for(int i=7;i<=n;i+=7) {
		sum+=i;
	}
	System.out.println(sum);
}

}
