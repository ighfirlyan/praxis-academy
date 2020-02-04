public class BalanceInquiry extends ATMMachine {
    static double balance=0;
    public void setBalanceInquiry(double b) {
        balance = b;
    }
    public static double getBalanceInquiry() {
        return balance;
    }
}