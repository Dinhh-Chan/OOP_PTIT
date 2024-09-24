
import java.util.Scanner;

public class J01004 {
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        else if (n == 2 || n ==3 ){
            return  false;
        }
        else if (n%2 == 0 || n % 3 ==0 ){
            return  false; 
        }
        int i = 5;
        while (i*i <=n){
            if (n% i ==0 || n% (i+2)==0 ){
                return false;
            }
            i+= 6 ;
        }
        return true ;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t ; i ++){
            int number = sc.nextInt();
            if (isPrime(number)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
