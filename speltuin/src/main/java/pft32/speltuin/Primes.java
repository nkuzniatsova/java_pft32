package pft32.speltuin;

/**
 * Created by Natallia on 27/10/16.
 */
public class Primes {

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i = i+ 1) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime(long n) {
        for (long i = 2; i < n; i = i+ 1) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
