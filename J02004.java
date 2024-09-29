
import java.util.Scanner;

public class J02004 {
    public static boolean solve(String arr[]){
        for (int i = 0; i < arr.length / 2; i++) {
            if (!arr[i].equals(arr[arr.length - 1 - i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int t = sc.nextInt();
        for (int i =0 ; i < t ; i++){
            int length_arr = sc.nextInt();
            String arr[] = new String[length_arr];
            for (int j = 0 ; j <length_arr ; j++){
               arr[j]= sc.next();
            }
            if(solve(arr)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }
    }
}
