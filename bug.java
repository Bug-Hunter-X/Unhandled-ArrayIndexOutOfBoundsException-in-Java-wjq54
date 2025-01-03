public class UncommonBug {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            arr[5] = 10; // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught the exception");
            // The bug is that we are catching the exception, but not handling it properly, 
            // or logging it.  This means that a critical failure has happened
            // and the application will continue running with a corrupt state.
        }
        System.out.println("Program continues...");
    }
}