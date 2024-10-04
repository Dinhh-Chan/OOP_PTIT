
import java.util.Scanner;

public class J02014 {
    public static boolean solve(int n, int arr[]){
        int left = 0 ;
        int right = 0 ; 
        for (int i = 0 ; i < n ; i++){
            left += arr[i];
        }
        for (int j = (arr.length)-1 ; j > n ; j-- ){
            right += arr[j]; 
        }
        if (left == right){
            return true;
        }
        return false; 
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in); 
        int t = sc.nextInt();
        for (int i = 0 ; i < t ;i ++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0 ; j < n ; j++){
                arr[i]= sc.nextInt();
            }
            int check = 0 ; 
            for (int j = 1 ; j < n-1 ; j++){
                if (solve(j, arr)){
                    check = 1 ;
                    System.out.println(j+1);
                    break;
                }
            }
            if (check == 0 ){
                System.out.println("-1");
            }

        }
    }   
}
