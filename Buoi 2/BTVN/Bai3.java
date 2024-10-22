import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max1 = Integer.MIN_VALUE,max2 = Integer.MIN_VALUE;
        for(int i = 0; i < 5; i++) {
            int x = sc.nextInt();
            if (max1 < x) {
                max2 = max1;
                max1 = x;
            }
            else if (x < max1 && x > max2) max2 = x;
        }
        System.out.print(max2 + " " + max1);
    }
}
