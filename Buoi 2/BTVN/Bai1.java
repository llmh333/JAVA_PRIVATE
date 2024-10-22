import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b = sc.nextInt();

        while (b <2 || b > 16 ) {
            System.out.print("Nhap lai B (2<=N<=16): ");
            b = sc.nextInt();
        }
        String kt = "0123456789ABCDEF";
        char[] array =  kt.toCharArray();
        char[] out = new char[100];
        int i = 0;
        while(n > 0) {
            int temp = n % b;
            n /= b;
            out[i] = array[temp];
            i++;
        }
        for(int j = i-1; j >= 0; j--) {
            System.out.print(out[j]);
        }
    }
}
