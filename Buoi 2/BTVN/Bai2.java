import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 1;
        while(n > 0) {
            int temp = n % 10;
            res *= temp;
            n /= 10;
        }
        System.out.print(res);
    }
}
