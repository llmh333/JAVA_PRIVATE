import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        a[0] = 0;
        for(int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            a[i] += a[i-1];
        }
        int t = sc.nextInt();
        while (t != 0) {
            t--;
            int l = sc.nextInt() , r =sc.nextInt();
            System.out.println(a[r]    - a[l-1]);
        }
//        for(int i = 1; i <=n ; i++) {
//            System.out.print(a[i] + " ");
//        }
    }
}
