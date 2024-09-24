
import java.util.Scanner;

public class J01007 {
    public static boolean check(long  n) {
        long sodau= 0 ;
        if (n ==0 || n ==1  ){
            return true ;
        }
        long sothuhai =1 ; 
        long ketqua = 1; 
        while (sothuhai <= n ){
            if (sothuhai == n ){
                return true;
            }
            ketqua = sothuhai + sodau ;
            sodau = sothuhai ;
            sothuhai = ketqua ;
        }
        return  false ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        long t = sc.nextLong();
        for (int i = 0 ; i < t ; i++){
            if (check(sc.nextLong())){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
