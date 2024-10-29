import java.util.Scanner;

public class bai2 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String temp = "";
        for(int i = 0; i < s.length() ; i++) {
            if (!Character.isDigit(s.charAt(i))) System.out.print(s.charAt(i));
            else System.out.print(" ");
        }
        System.out.println("");
        for(int i = 0; i < s.length() ; i++) {
            if (!Character.isAlphabetic(s.charAt(i))) System.out.print(s.charAt(i));
            else System.out.print(" ");
        }
    }
}
