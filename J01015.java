import java.util.Scanner;

public class J01015 {
    public static void solve(String s){
        StringBuilder sb = new StringBuilder(s);
        int res = 0 ;
        for (char i: sb.toString().toCharArray() ){
            if (i =='4'|| i =='7'){
                res += 1 ;
            }
        }
        if (res == 4 || res == 7){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        solve(s);
    }
}
