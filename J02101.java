import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J02101 {

    public static String processMatrix(int N, int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < N; j++) {
                    result.add(matrix[i][j]);
                }
            } else {
                for (int j = N - 1; j >= 0; j--) {
                    result.add(matrix[i][j]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            sb.append(num).append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = Integer.parseInt(scanner.nextLine().trim()); // Số lượng bộ test
        List<String> outputs = new ArrayList<>();

        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(scanner.nextLine().trim()); // Kích thước ma trận
            int[][] matrix = new int[N][N];

            String[] elements = scanner.nextLine().trim().split("\\s+");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    matrix[i][j] = Integer.parseInt(elements[i * N + j]);
                }
            }

            outputs.add(processMatrix(N, matrix));
        }

        for (String output : outputs) {
            System.out.println(output);
        }

        scanner.close();
    }
}
