import java.util.Scanner;

public class J2021 {
    private static int n,k ;
    private static int count = 0; 
    public static void solve(int start, int[] com, int index) {
        if (index == k ){
            for (int i =0 ; i < k ; i++){
                System.out.println(com[i]);
            }
            System.out.println(" ");
            count ++ ; 
            return;
        }

    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int[] com = new int[k];
        solve(1, com, 0);
        System.out.println();
        System.out.println("Tong cong co " + count + " to hop");

    }
}
