public class BankAccount {
    double amount;

    public BankAccount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        this.amount += sum;
    }
    public void withDraw(int sum) throws LimitException {
        if (sum <= this.amount){
            this.amount -= sum;
        } else{
            throw new LimitException("У вас недостаточно средств!\nОстаток счета: ", this.amount);
        }
    }
}