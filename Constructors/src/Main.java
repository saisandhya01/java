public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Account a = new Account();
        a.withdrawal(100);
        a.deposit(50);
        a.withdrawal(25);
        Account b = new Account("235345", 123456.28, "356849");
        b.deposit(600);
    }
}