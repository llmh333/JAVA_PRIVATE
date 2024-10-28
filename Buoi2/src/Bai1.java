import java.util.Arrays;
import  java.util.Scanner;
public class Bai1 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[10000];
        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            a[i] = x;
        }
        int l = 0, r = n-1;
        boolean kt = false;
        while(l <= r) {
            int mid = (l+r)/2;
            if (a[mid] > k) r = mid-1;
            else if (a[mid] < k) l = mid+1;
            else if (a[mid] == k) {
                System.out.println(mid);
                kt = true;
                break;
            }
        }
        if (!kt) System.out.println("-1");

    }
}
