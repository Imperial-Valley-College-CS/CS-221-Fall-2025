public class FactorFinder {

    public static void main(String[] args) {
        int number = 20; // The number for which to find factors

        System.out.println("Factors of " + number + " are:");

        // Iterate from 1 up to the number
        for (int i = 1; i <= number; i++) {
            // Check if 'number' is perfectly divisible by 'i'
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // For a new line after printing factors
    }
}