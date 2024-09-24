
import java.util.Scanner;

public class J01001 {
    public static void main(String[] args) {
        Scanner myObj  = new Scanner(System.in);
        int chieudai = myObj.nextInt(); int chieurong = myObj.nextInt();
        int chuvi = (chieudai + chieurong )* 2 ;
        int s = chieudai*chieurong;
        if (chieudai <= 0 || chieurong <= 0 )System.out.println("0");
        else
        System.out.println(chuvi + " "+ s);
    }
}
