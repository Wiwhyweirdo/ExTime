public class PrimeTest {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        int sqrtN = (int) Math.sqrt(n);
        for (int i = 3; i <= sqrtN; i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 17, 18, 19, 20};

        for (int n : numbers) {
            boolean result = isPrime(n);
            System.out.println("Is " + n + " prime? " + result);
        }
    }
}
