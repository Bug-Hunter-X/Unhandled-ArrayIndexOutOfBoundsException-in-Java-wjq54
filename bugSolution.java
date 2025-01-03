public class UncommonBugSolution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[5] = 10; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
            // Log the error or take corrective action
            // e.g., return, throw a custom exception, etc.
            // System.exit(1); // Exit program
        }
        // ... rest of the program ...
    }
}