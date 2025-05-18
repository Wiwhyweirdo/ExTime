import java.util.Scanner;

public class FragmentChecker{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for n: ");
        int n = scanner.nextInt();

        long sum = 0;

        long startTime = System.nanoTime();


        // >>>  FRAGMENT

        for (int i = 0; i < n; i++) {
            sum++;
        }
        // <<<  FRAGMENT HERE


        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000; // ms

        System.out.println("Execution time: " + duration + " ms");

    }
}
