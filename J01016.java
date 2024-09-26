
import java.util.Scanner;

public class J01016 {
    public static boolean solve(String s){
        for (int i = 1; i < s.length()-1 ; i++){
            char c =s.charAt(i);
            int digit = Integer.parseInt(String.valueOf(c));
            if (Math.abs(digit - Integer.parseInt(String.valueOf(s.charAt(i-1))))!= 1 || Math.abs(digit - Integer.parseInt(String.valueOf(s.charAt(i+1))))!= 1 ){
                return false ;
            }

        }
        return  true ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0 ; i < t ; i ++){
            String s = sc.next();
            if (solve(s)){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
