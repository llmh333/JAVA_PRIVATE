import java.util.Scanner;

public class bai3 {
    public static String cong(String s1, String s2) {
        while (s1.length() < s2.length()) s1 = "0" + s1;
        while (s1.length() > s2.length()) s2 = "0" + s2;
        int nho = 0;
        String temp = "";
        for(int i = s1.length()-1; i >= 0; i--) {
            int a = Integer.parseInt(String.valueOf(s1.charAt(i)));
            int b = Integer.parseInt(String.valueOf(s2.charAt(i)));
            int tong = a + b + nho;
            nho = tong / 10;
            tong %= 10;
            temp = Integer.toString(tong)+temp;

        }
        if (nho != 0) temp = "1" + temp;
        return temp;
    }
    public static String nhan1(String s1, String s2) {
        String temp = "";
        int b = Integer.parseInt(s2);
        int nho = 0;
        for(int i = s1.length()-1; i >= 0; i--) {
            int a = Integer.parseInt(String.valueOf(s1.charAt(i)));
            int tong = a * b + nho;
            nho = tong / 10;
            tong %= 10;
            temp = Integer.toString(tong) + temp;
        }
        if (nho != 0) temp = Integer.toString(nho) + temp;
        return temp;
    }
    public static String nhan2(String s1, String s2) {
        String temp = "";
        int dem = 0;
        for(int i = s2.length()-1; i >= 0; i--) {
            String s3 = nhan1(s1, String.valueOf(s2.charAt(i)));
            for(int j = 0; j < dem; j++) s3 += "0";
            dem++;
            temp = cong(s3,temp);
        }
        return temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine(), y = sc.nextLine();
        String res = nhan2(x,y);
//        int y1 = Integer.parseInt(y);
//        for(int i = 1; i < y1; i++) {
//            res = nhan2(res,y);
//        }
        System.out.println(res);
    }
}
