import java.util.Scanner;

public class Bai_13{
public static void main(String[] args) {
	int m,n;
	Scanner sc = new Scanner(System.in);
	System.out.println("nhập m");
	m=sc.nextInt();
	System.out.println("nhap n");
	n=sc.nextInt();
	int count=0;
	 if ((m >= 0 && n >= 0) || n >= 0) {
         for (int i = m; i <= n; i++) {
             if(i>=0){
                 int res = (int)Math.sqrt(i);
                 if(res*res == i){
                     count++;
                     System.out.printf("%10d", i);
                     if(count %10 == 0){
                         System.out.println();
				}
			}
		}
	}
	 }
	System.out.println("so chinh phương"+count);

}
}
