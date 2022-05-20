import java.util.List;

public class Employee {
    private Bank bank = null;
    private String name;

    public Employee(Bank bank, String name){
        this.bank = bank;
        this.name = name;
    }

    public Bank getBank() {
        return this.bank;
    }

    public String getName() {
        return name;
    }

    public void setBank(Bank bank){
        this.bank = bank;
    }

    public void lookup(String name){
        List<Account> list = this.bank.getAccounts();
        Account foundAccount = null;
        for(Account account : list){
            if(account.getName().equals(name)){
                foundAccount = account;
                break;
            }
        }

        if(foundAccount == null) System.out.println("Account not found");
        else System.out.println(foundAccount.getName() + "'s current balance " + foundAccount.getDeposit() + "$");
    }

    public void changeInterestRate(String type, double interestRate) {
        System.out.println("You don't have permission for this operation");
    }

    public void seeInternalFund() {
        System.out.println("You don't have permission for this operation");
    }

    public void approveLoan(){
        String name = "";
        for(Account account : getBank().getAccounts()){
            if(account.getLoanPending() > 0){
                account.setLoanReq(account.getLoanReq()+account.getLoanPending());
                account.setInterestRate(10);
                account.setLoanPending(0);
                name += account.getName()+", ";
            }
        }

        if(!name.isEmpty()) System.out.println("Loan for " + name + " approved");
        else System.out.println("No loan to approve");
    }
}

class MD extends Employee{
    public MD(Bank bank, String name){
        super(bank, name);
    }

    @Override
    public void changeInterestRate(String type, double interestRate){
        for(Account account : getBank().getAccounts()){
            if(account.getType().equals(type)) account.setInterestRate(interestRate);
        }

        System.out.println("Interest Rate of " + type + " account changed to " + interestRate);
    }

    @Override
    public void seeInternalFund(){
        System.out.println("Internal fund is: " + getBank().getFund());
    }
}

class Officer extends Employee{
    public Officer(Bank bank, String name){
        super(bank, name);
    }
}

class Cashier extends Employee{
    public Cashier(Bank bank, String name) { super(bank, name); }

    @Override
    public void approveLoan(){
        System.out.println("You don't have permission for this operation");
    }
}
