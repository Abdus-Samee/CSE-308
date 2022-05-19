import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){
            String[] arr = scanner.nextLine().split(" ");

            if(arr[0].equals("Create")){
                Account studentAccount = new Student(arr[1], arr[2], Integer.parseInt(arr[3]));
                bank.addAccount(studentAccount);
                accountOps(studentAccount);
            }else if(arr[0].equals("Open")){
                Object object = bank.open(arr[1]);

                if(object == null) System.out.println("Invalid name");
                else if(object instanceof Account){
                    Account account = (Account)object;
                    accountOps(account);
                }else if(object instanceof Employee){
                    Employee employee = (Employee)object;
                    employeeOps(employee);
                }
            }else if(arr[0].equals("INC")) bank.inc();
            else System.out.println("Invalid operation");
        }
    }

    public static void accountOps(Account account){
        Scanner accountScanner = new Scanner(System.in);

        while(accountScanner.hasNext()){
            String[] arr = accountScanner.nextLine().split(" ");

            if(arr[0].equals("Deposit")) account.depositAmount(Integer.parseInt(arr[1]));
            else if(arr[0].equals("Withdraw")) account.withdraw(Integer.parseInt(arr[1]));
            else if(arr[0].equals("Query")) account.queryDeposit();
            else if(arr[0].equals("Request")) account.requestLoan(Integer.parseInt(arr[1]));
            else if(arr[0].equals("Close")) break;
            else System.out.println("Invalid operation on account");
        }
    }

    public static void employeeOps(Employee employee){
        Scanner employeeScanner = new Scanner(System.in);

        while(employeeScanner.hasNext()){
            String[] arr = employeeScanner.nextLine().split(" ");

            if(arr[0].equals("Approve") && arr[1].equals("Loan")) employee.approveLoan();
            else if(arr[0].equals("Change")) employee.changeInterestRate();
            else if(arr[0].equals("Lookup")) employee.lookup(arr[1]);
            else if(arr[0].equals("See")) employee.seeInternalFund();
            else if(arr[0].equals("Close")) break;
            else System.out.println("Invalid operation on employee");
        }
    }
}
