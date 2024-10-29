import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String[] temp = new String[n.length()];
        for(int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == '0') temp[i] = "khong";
            if (n.charAt(i) == '1') temp[i] = "mot";
            if (n.charAt(i) == '2') temp[i] = "hai";
            if (n.charAt(i) == '3') temp[i] = "ba";
            if (n.charAt(i) == '4') temp[i] = "bon";
            if (n.charAt(i) == '5') temp[i] = "nam";
            if (n.charAt(i) == '6') temp[i] = "sau";
            if (n.charAt(i) == '7') temp[i] = "bay";
            if (n.charAt(i) == '8') temp[i] = "tam";
            if (n.charAt(i) == '9') temp[i] = "chin";
        }
        if (n.length() == 1) {
            System.out.print(temp[0]);
        }
        else if (n.length() == 2) {
            if (n.charAt(0) == '1') System.out.print("Muoi" + " " + temp[1]);
            else System.out.print(temp[0] + " muoi " + temp[1]);
        }
        else if (n.length() == 3) {
            if (n.charAt(1) == '0' && n.charAt(2) != '0') System.out.print(temp[0] + " tram linh " + temp[2]);
            else if (n.charAt(1) == '0' && n.charAt(1) == '0') System.out.println(temp[0] + " tram");
            else System.out.print(temp[0] + " tram " + temp[1] + " muoi " + temp[2]);
        }
        else if (n.length() == 4) {
            if (n.equals("1000")) System.out.println("Mot ngin");
            else System.out.print(temp[0] + " nghin " + temp[1] + " tram " + temp[2] + " muoi " + temp[3]);
        }


    }
}
