import java.util.Scanner;

public class J04015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String maNgach = scanner.nextLine();  
        String hoTen = scanner.nextLine();   
        int luongCoBan = scanner.nextInt();   

        int bacLuong = Integer.parseInt(maNgach.substring(2));

        int phuCap = 0;
        if (maNgach.startsWith("HT")) {
            phuCap = 2000000;
        } else if (maNgach.startsWith("HP")) {
            phuCap = 900000;
        } else if (maNgach.startsWith("GV")) {
            phuCap = 500000;
        }

        int luongThang = luongCoBan * bacLuong;
        int thuNhap = luongThang + phuCap;

        System.out.printf("%s %s %d %d %d\n", maNgach, hoTen, bacLuong, phuCap, thuNhap);

        scanner.close();
    }
}
