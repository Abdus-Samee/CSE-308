import java.util.ArrayList;
import java.util.List;

public class Bank {
    private int clock;
    private int fund;
    private Employee[] employees;
    private List<Account> accounts;

    public Bank(){
        this.clock = 0;
        this.fund = 1000000;
        this.employees = new Employee[8];
        this.accounts = new ArrayList<>();

        this.employees[0] = new MD(this, "MD");

        for(int i = 1; i < 3; i++){
            this.employees[i] = new Officer(this, "S"+i);
        }
        for(int i = 3; i < 8; i++){
            this.employees[i] = new Cashier(this, "C"+(i-2));
        }

        System.out.println("Bank Created; MD, S1, S2, C1, C2, C3, C4, C5 created");
    }

    public int getClock() {
        return clock;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        this.accounts.add(account);
        account.setBank(this);

        if(account instanceof Loan) setFund(getFund()-account.getDeposit());
        else setFund(getFund()+account.getDeposit());
    }

    public int getFund() {
        return fund;
    }

    public void setFund(int fund) {
        this.fund = fund;
    }

    public String checkLoan(){
        int count = 0;
        for(Account account : accounts){
            if(account.getLoanPending() > 0) count++;
        }

        if(count > 0) return ", there are loan approvals pending";
        else return "";
    }

    public Object open(String name){
        if(name.equals("MD")){
            System.out.printf("MD is active");
            System.out.printf(checkLoan());
            System.out.println();

            return employees[0];
        }else if(name.charAt(0) == 'S'){
            System.out.printf(name + " is active");
            System.out.printf(checkLoan());
            System.out.println();

            if(name.equals("S1")) return this.employees[1];
            else return this.employees[2];
        }else if(name.charAt(0) == 'C'){
            System.out.printf(name + " is active");
            int idx = Integer.parseInt(name.substring(1))+2;

            return employees[idx];
        }else{
            Account found = null;
            for(Account account : accounts){
                if(account.getName().equals(name)){
                    found = account;
                    break;
                }
            }

            return found;
        }
    }

    public void inc(){
        this.clock++;
        System.out.println("1 year passed");

        for(Account account : this.accounts){
            if(account.getLoanReq() > 0) {
                account.setDeposit(account.getDeposit()+((account.getDeposit()+account.getLoanReq())*5)/100);
                account.setDeposit(account.getDeposit() - (int) (account.getLoanReq() * account.getInterestRate()) / 100);
                account.setDeposit(account.getDeposit()-500);
            }
        }
    }
}
