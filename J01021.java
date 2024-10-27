import java.util.Scanner;

public class J01021 {
     public static long powmod(long a, long b, long mod) {
        long result = 1;
        a = a % mod; 
        while (b > 0) {
            if ((b & 1) == 1) {
                result = multiplyMod(result, a, mod);
            }
            b = b >> 1;
            a = multiplyMod(a, a, mod);
        }
        return result;
    }

    public static long multiplyMod(long a, long b, long mod) {
        return (a * b) % mod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final long MOD = 1000000007;
        int testCount = 0;

        while (testCount < 20) { 
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) {
                break;
            }
            long result = powmod(a, b, MOD);
            System.out.println(result);

            testCount++;
        }
        sc.close();
    }
}
