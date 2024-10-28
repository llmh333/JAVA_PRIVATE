import  java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n+2], b = new int[n+2];
        b[0] = 0;
        for(int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            a[i] = x;
            b[i] += b[i-1] + a[i];
        }
        int max = Integer.MIN_VALUE;
        while(k <= n) {
            for(int i = 0; i <= n-k; i++) {
                if (max < b[i+k]-b[i])
                {
                    max = b[i+k]-b[i];
                }
            }
            k++;
        }

        System.out.println(max);
    }
}
