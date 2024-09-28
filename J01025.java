
import java.util.Scanner;

public class J01025 {
    public static int find_max(int arr[]){
        int Max_value = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length; i++){
            Max_value = Math.max(Max_value, arr[i]);
        }
        return  Max_value ; 

    }
    public static int find_min(int arr[]){
        int Min_value = Integer.MAX_VALUE;
        for (int i = 0 ; i < arr.length; i++){
            Min_value = Math.min(Min_value, arr[i]);
        }
        return  Min_value ; 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int x1 =  sc.nextInt() ;
        int y1 = sc.nextInt() ; 
        int x2 = sc.nextInt() ;
        int y2 = sc.nextInt() ;
        int x3 = sc.nextInt() ;
        int y3 = sc.nextInt() ;
        int x4 = sc.nextInt() ;
        int y4 = sc.nextInt() ;
        int arr[]= {y1, y2,y3,y4};
        int xarr[]= {x1,x2,x3,x4};

        int ymax = find_max(arr);
        int ymin = find_min(arr);
        int xmax= find_max(xarr); 
        int xmin = find_min(xarr); 
        if ((ymax - ymin)*(ymax-ymin)> (xmax- xmin)*(xmax -xmin)){
            System.out.println((ymax - ymin)*(ymax-ymin));
        }
        else{
            System.out.println((xmax- xmin)*(xmax -xmin));
        }
    }
}
