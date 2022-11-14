public class Account {
    private String number;
    private double balance;
    private String account_number;

    public Account(){
        this("423842", 2434, "678");
        //constructor called inside a constructor. But this has t
        System.out.println("Empty constructor called");
    }
    public Account(String account_number, double balance, String number){
        this.account_number = account_number;
        this.balance = balance;
        this.number = number;
        System.out.println("Parameter constructor called. successful");
    }
    public void deposit(double depositAmount){
        balance += depositAmount;
        System.out.println("balance after deposit: " + balance);
    }
    public void withdrawal(double withdrawalAmount){
        if(balance - withdrawalAmount < 0){
            System.out.println("withdrawal not possible");
        }
        else{
            balance -= withdrawalAmount;
            System.out.println("Balance after withdrawal: " + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }
}
