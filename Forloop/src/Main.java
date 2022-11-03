public class Main {
    public static void main(String[] args) {
       for(double i=2.0; i<=8.0; i++){
           System.out.println("10000 at " + i + " % interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
       }
        for(int i=8; i >= 2; i--){
            System.out.println("10000 at " + i + " % interest = " + String.format("%.2f",calculateInterest(10000.0, i)));
        }

        int count = 0, sum = 0;
        for(int i=1; i<=1000; i++){
            if(i % 3 == 0 && i % 5 == 0){
                count++;
                sum += i;
                if(count == 5){
                    break;
                }
            }
        }
        System.out.println(sum);
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate /100));
    }
}