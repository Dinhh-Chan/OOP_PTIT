import java.util.Scanner;

public class J01017 {
    public static boolean solve(String s){
        int res = Integer.parseInt(String.valueOf(s.charAt(0))) ;
        for (int i = 1; i < s.length()-1 ; i++){
            char c =s.charAt(i);
            int digit = Integer.parseInt(String.valueOf(c));
            res += digit ; 
            if (Math.abs(digit - Integer.parseInt(String.valueOf(s.charAt(i-1))))!= 2 || Math.abs(digit - Integer.parseInt(String.valueOf(s.charAt(i+1))))!= 2 ){
                return false ;
            }

        }
        res += Integer.parseInt(String.valueOf(s.charAt(s.length()-1)));
        if (res %10 != 0 ){
            return  false;
        }
        return  true ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        for (int i = 0 ; i< t  ; i++){
            String s = sc.next();
            if (solve(s)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
