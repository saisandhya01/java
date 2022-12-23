import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String name, double initialAmount){
        if(findCustomer(name) == null){
            customers.add(new Customer(name, initialAmount));
            return true;
        }
        return false;
    }
   public boolean addCustomerTransaction(String name, double amount){
        Customer existingCustomer = findCustomer(name);
        if(existingCustomer != null){
            existingCustomer.addTransaction(amount);
            return true;
        }
        return false;
   }
   private Customer findCustomer(String customerName){
        for(int i=0; i<this.customers.size(); i++){
            Customer currentCustomer = this.customers.get(i);
            if(currentCustomer.getName().equals(customerName)){
                return currentCustomer;
            }
        }
        return null;
   }

   public void listCustomers(boolean showTransactions){
        for(int i=0; i<this.customers.size(); i++){
            Customer currentCustomer = this.customers.get(i);
            System.out.println("Customer name: " + currentCustomer.getName());
            if(showTransactions){
                ArrayList<Double> txns = currentCustomer.getTransactions();
                for(int j=0; j<txns.size(); j++){
                    System.out.println(txns.get(j));
                }
            }
        }
   }
}
