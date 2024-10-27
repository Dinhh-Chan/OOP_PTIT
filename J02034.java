import java.util.HashSet;
import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        HashSet<Integer> numberSet = new HashSet<>();
        for (int i = 0 ; i< n ; i++){
            arr[i]= sc.nextInt();
            numberSet.add(arr[i]);
        }
        int max = arr[n-1];
        boolean check = false ; 
        for (int i = 1 ; i <= max ; i ++){
            if (!numberSet.contains(i)){
                System.out.println(i);
                check = true;
            }
        }
        if (!check){
            System.out.println("Excellent!");
        }

    }
}
