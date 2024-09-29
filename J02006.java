import java.util.*;

public class J02006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Set<Integer> unionSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            unionSet.add(scanner.nextInt());
        }
        for (int i = 0; i < m; i++) {
            unionSet.add(scanner.nextInt());
        }
        List<Integer> result = new ArrayList<>(unionSet);
        Collections.sort(result);
        for (int num : result) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
