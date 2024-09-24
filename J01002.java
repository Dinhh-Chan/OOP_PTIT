
import java.util.Scanner;

public class J01002 {
    public static long   res(long n){
        long res = n*(n+1)/2;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        for (int i = 0 ; i < t ; i ++){
            int number = sc.nextInt();
            System.out.println(res(number));
        }
        sc.close();

    }
}
