package BankAccount;

public class Account {
    private String number;
    public double balance;
    public String customerName;
    public String customerEmailAddress;
    public String cusstomerPhoneNumber;


    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public void setCusstomerPhoneNumber(String cusstomerPhoneNumber) {
        this.cusstomerPhoneNumber = cusstomerPhoneNumber;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public String getCusstomerPhoneNumber() {
        return cusstomerPhoneNumber;
    }
}
