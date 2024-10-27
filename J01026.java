
import java.util.Scanner;

public class J01026 {
    public static boolean solve(double x ){
        double so_chinh_phuong = Math.pow(x, 1.0/2.0);
        double so_so_sanh = (double)(int) so_chinh_phuong;   
        if (so_chinh_phuong == so_so_sanh ){
            return  true ;
        
        }  else {
            return false ;
        }       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i= 0 ;i <t ; i++){
            if (solve(sc.nextDouble())){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }
}
