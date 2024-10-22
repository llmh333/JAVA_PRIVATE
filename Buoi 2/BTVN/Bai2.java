import java.util.Scanner;
import java.lang.Math;
public class hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 1;
        while(n != 0) {
            int temp = n % 10;
            res *= temp;
            n /= 10;
            System.out.println(n);

        }
        System.out.print(Math.abs(res));
    }
}
