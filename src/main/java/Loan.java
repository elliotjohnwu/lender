public class Loan {
    private String borrower;
    private int amount;
    private boolean isPaid;
    private double interestRate;
    private String contactNumber;

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPaid() { //directly remove bool paid variable in ()
        isPaid = true; //directly set to true
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Loan(int amount, String borrower, double interestRate, String contactNumber) {
        this.amount = amount;
        this.borrower = borrower;
        this.interestRate = interestRate;
        this.contactNumber = contactNumber;
    }

    public void setAsPaid() {
        isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public String getBorrower() {
        return borrower;
    }

    public String getDisplayString() {
        return borrower + ": " + amount;
    }

    public double getProfit() {
        return amount * interestRate;
    }
}
