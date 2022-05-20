public class Account {
    private Bank bank = null;
    private String name;
    private String type;
    private int deposit;
    private int loanReq;
    private int loanPending;
    private double interestRate;

    public Account(String name, String type, int deposit){
        this.name = name;
        this.type = type;
        this.deposit = deposit;
        this.loanReq = 0;
        this.loanPending = 0;
        this.interestRate = 0;
    }

    public Bank getBank() {
        return this.bank;
    }

    public void setBank(Bank bank){
        this.bank = bank;
    }

    public int getLoanPending() {
        return loanPending;
    }

    public void setLoanPending(int loanPending) {
        this.loanPending = loanPending;
    }

    public int getLoanReq() {
        return loanReq;
    }

    public void setLoanReq(int loanReq) {
        this.loanReq = loanReq;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void depositAmount(int deposit){}

    public String getName(){ return this.name; }

    public String getType(){ return this.type; }

    public int getDeposit() { return deposit; }

    public void setDeposit(int deposit) { this.deposit = deposit; }

    public void withdraw(int withdraw){}

    public void requestLoan(int loanReq) {}

    public void queryDeposit(){
        System.out.printf("Current balance: " + (this.deposit+this.loanReq) + "$");
        if(this.loanReq > 0) System.out.printf(", Loan: " + this.loanReq + "$");
        System.out.println();
    }
}

class Savings extends Account{
    public Savings(String name, String type, int deposit) {
        super(name, type, deposit);
        System.out.println("Savings account for " + name + " created; initial balance " + deposit + "$");
    }

    @Override
    public void depositAmount(int deposit) {
        setDeposit(getDeposit()+deposit);
        System.out.println(deposit + "$ deposited; Current balance: " + getDeposit() + "$");
    }

    @Override
    public void withdraw(int withdraw) {
        if(getDeposit()-withdraw >= 1000) {
            setDeposit(getDeposit() - withdraw);
            System.out.println("Valid transaction; Current balance: " + getDeposit() + "$");
        }
        else
            System.out.println("Invalid transaction; Current balance: " + getDeposit() + "$");
    }

    @Override
    public void requestLoan(int loanReq) {
        if(getLoanPending()+getLoanReq()+loanReq > 10000) System.out.println("Loan request unsuccessful");
        else {
            setLoanPending(getLoanPending()+loanReq);
            System.out.println("Loan request successful, sent for approval");
        }
    }
}

class Student extends Account{
    public Student(String name, String type, int deposit) {
        super(name, type, deposit);
        System.out.println("Student account for " + name + " created; initial balance " + deposit + "$");
    }

    @Override
    public void depositAmount(int deposit) {
        setDeposit(getDeposit()+deposit);
        System.out.println(deposit + "$ deposited; Current balance: " + getDeposit() + "$");
    }

    @Override
    public void withdraw(int withdraw) {
        if(withdraw <= 10000 && withdraw <= getDeposit()) {
            setDeposit(getDeposit() - withdraw);
            System.out.println("Valid transaction; Current balance: " + getDeposit() + "$");
        }
        else
            System.out.println("Invalid transaction; Current balance: " + getDeposit() + "$");
    }

    @Override
    public void requestLoan(int loanReq) {
        if(getLoanPending()+getLoanReq()+loanReq > 1000) System.out.println("Loan request unsuccessful");
        else {
            setLoanPending(getLoanPending()+loanReq);
            System.out.println("Loan request successful, sent for approval");
        }
    }
}

class Loan extends Account{
    public Loan(String name, String type, int deposit) {
        super(name, type, deposit);
        System.out.println("Loan account for " + name + " created; initial loan " + deposit + "$");
    }

    @Override
    public void depositAmount(int deposit) {
        setDeposit(getDeposit()+deposit);
        System.out.println(deposit + "$ deposited; Current balance: " + getDeposit() + "$");
    }

    @Override
    public void withdraw(int withdraw) {
        System.out.println("Invalid transaction; Current loan balance: " + getDeposit() + "$");
    }

    @Override
    public void requestLoan(int loanReq) {
        int maxLoan = (getDeposit()*5)/100;

        if(loanReq <= maxLoan) {
            setDeposit(loanReq);
            System.out.println("Loan request successful, sent for approval");
        }else System.out.println("Loan request unsuccessful");
    }
}

class FixedDeposit extends Account{
    public FixedDeposit(String name, String type, int deposit) {
        super(name, type, deposit);
        System.out.println("Fixed Deposit account for " + name + " created; initial balance " + deposit + "$");
    }

    @Override
    public void depositAmount(int deposit) {
        if(deposit >= 50000){
            setDeposit(getDeposit()+deposit);
            System.out.println(deposit + "$ deposited; Current balance: " + getDeposit() + "$");
        }
    }

    @Override
    public void withdraw(int withdraw) {
        if(getBank().getClock() >= 1){
            setDeposit(getDeposit() - withdraw);
            System.out.println("Valid transaction; Current balance: " + getDeposit() + "$");
        }
        else
            System.out.println("Invalid transaction; Current loan balance: " + getDeposit() + "$");
    }

    @Override
    public void requestLoan(int loanReq) {
        if(getLoanPending()+getLoanReq()+loanReq > 100000) System.out.println("Loan request unsuccessful");
        else {
            setLoanPending(getLoanPending()+loanReq);
            System.out.println("Loan request successful, sent for approval");
        }
    }
}
