import java.util.*;

public class guddu {
    public static void main(String[] args) {
        boolean isPrime[] = myNameIsArya(10);
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " " + isPrime[i]);
        }
    }

    static boolean[] myNameIsArya(int n) {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
}
