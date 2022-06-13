public class LimitException extends Exception {
    public LimitException(String message, double remainingAmount) {
        super(message);
    }

    public static double getRemainingAmount(int sum, double amount) {
        return sum - amount;
    }
}

