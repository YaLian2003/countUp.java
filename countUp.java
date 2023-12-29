public class CountUp {

    // Recursive method to count up from 0 to n
    public static void countUp(int n) {
        if (n < 0) {
            // Base case: If n is negative, return to stop the recursion
            return;
        }
        countUp(n - 1); // Recursive call with n-1
        System.out.println(n); // Print the number after the recursive call
    }

    public static void main(String[] args) {
        // Hardcoded value for demonstration, you can replace it or use user input
        int targetNumber = 10;

        // Call the recursive method
        countUp(targetNumber);
    }
}


