import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class MatHang {
    private String ma;
    private String ten;
    private String donViTinh;
    private int giaMua;
    private int giaBan;
    private int loiNhuan;

    public MatHang(String ma, String ten, String donViTinh, int giaMua, int giaBan) {
        this.ma = ma;
        this.ten = ten;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    public String getMa() {
        return ma;
    }

    public int getLoiNhuan() {
        return loiNhuan;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donViTinh + " " + giaMua + " " + giaBan + " " + loiNhuan;
    }
}

public class J05081 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = Integer.parseInt(sc.nextLine());
        ArrayList<MatHang> danhSachMatHang = new ArrayList<>();

        for (int i = 1; i <= M; i++) {
            String ma = String.format("MH%03d", i);
            String ten = sc.nextLine();
            String donViTinh = sc.nextLine();
            int giaMua = Integer.parseInt(sc.nextLine());
            int giaBan = Integer.parseInt(sc.nextLine());
            MatHang matHang = new MatHang(ma, ten, donViTinh, giaMua, giaBan);
            danhSachMatHang.add(matHang);
        }

        Collections.sort(danhSachMatHang, new Comparator<MatHang>() {
            @Override
            public int compare(MatHang mh1, MatHang mh2) {
                if (mh2.getLoiNhuan() != mh1.getLoiNhuan()) {
                    return mh2.getLoiNhuan() - mh1.getLoiNhuan();
                }
                return mh1.getMa().compareTo(mh2.getMa());
            }
        });

        for (MatHang matHang : danhSachMatHang) {
            System.out.println(matHang);
        }

        sc.close();
    }
}
