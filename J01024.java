
import java.util.Scanner;

public class J01024 {
    public static boolean solve(String s){
        for (int i = 0 ; i < s.length(); i ++){
            if (Integer.parseInt(String.valueOf(s.charAt(i)))> 2 ){
                return false; 
            }
        }
        return true ;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        int t = sc.nextInt();
        for (int i = 0; i <t ; i++){
            String s = sc.next();
            if (solve(s)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
