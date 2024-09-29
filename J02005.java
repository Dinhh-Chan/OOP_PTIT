
import java.util.*;
public class J02005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Set<Integer> setA= new HashSet<>();
        for (int i = 0 ; i <n ;i++){
            setA.add(sc.nextInt());
        }
        Set<Integer> setB = new HashSet<>();
        for (int i = 0; i < m; i++) {
            setB.add(sc.nextInt());
        }
        setA.retainAll(setB);
        List<Integer> res = new ArrayList<>(setA);
        Collections.sort(res);
        for (int num : res) {
            System.out.print(num + " ");
        }

    }
}
