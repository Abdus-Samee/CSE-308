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

        this.employees[0] = new MD();

        for(int i = 1; i < 3; i++){
            this.employees[i] = new Officer();
            this.employees[i].setBank(this);
        }
        for(int i = 3; i < 8; i++){
            this.employees[i] = new Cashier();
            this.employees[i].setBank(this);
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
            if(account.getLoanReq() > 0) count++;
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

            int idx = Integer.parseInt(name.substring(0, 1))-1;

            return employees[idx];
        }else if(name.charAt(0) == 'C'){
            System.out.printf(name + " is active");
            int idx = Integer.parseInt(name.substring(0, 1))-1;

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
    }
}
