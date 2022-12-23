import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;
    private String bankName;

    public Bank(String name) {
        this.bankName = name;
        this.branches = new ArrayList<Branch>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) == null){
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount){
        Branch b = findBranch(branchName);
        if(b != null){
            return b.newCustomer(customerName, initialAmount);
        }
        return false;
    }
    public boolean addTransaction(String branchName, String customerName, double amount){
        Branch b = findBranch(branchName);
        if(b != null){
            return b.addCustomerTransaction(customerName, amount);
        }
        return false;
    }
    private Branch findBranch(String branchName){
        for(int i=0; i<this.branches.size(); i++){
            Branch currentBranch = this.branches.get(i);
            if(currentBranch.getName().equals(branchName)){
                return currentBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch b = findBranch(branchName);
        if(b != null){
            b.listCustomers(showTransactions);
            return true;
        }
        return false;
    }
}
