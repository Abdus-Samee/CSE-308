import java.util.List;

public class Employee {
    private Bank bank = null;

    public Employee(){

    }

    public Bank getBank() {
        return this.bank;
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

    public void changeInterestRate() {
        System.out.println("You don't have permission for this operation");
    }

    public void seeInternalFund() {
        System.out.println("You don't have permission for this operation");
    }

    public void approveLoan(){
        System.out.println("You don't have permission for this operation");
    }
}

class MD extends Employee{
    public MD(){
        super();
    }

    @Override
    public void approveLoan(){
        String name = "";
        for(Account account : getBank().getAccounts()){
            if(account.getLoanPending() > 0){
                account.setLoanReq(account.getLoanReq()+account.getLoanPending());
                account.setLoanPending(0);
                name += account.getName()+", ";
            }
        }

        if(!name.isEmpty()) System.out.println("Loan for " + name + " approved");
        else System.out.println("No loan to approve");
    }

    @Override
    public void changeInterestRate(){

    }

    @Override
    public void seeInternalFund(){
        System.out.println("Internal fund is: " + getBank().getFund());
    }
}

class Officer extends Employee{
    public Officer(){
        super();
    }

    @Override
    public void approveLoan(){

    }
}

class Cashier extends Employee{

}
