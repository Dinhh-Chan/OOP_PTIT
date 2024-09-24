
import java.util.Scanner;

public class J01009 {
    public static long giaithua(long n){
        long res = 1 ;
        for (long i = 1 ; i <= n; i++){
            res = res * i;
        }
        return  res ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 0;
        for (long i = 1 ; i <= n ; i++){
            res += giaithua(i);
        }
        System.out.println(res);
    }
} 
