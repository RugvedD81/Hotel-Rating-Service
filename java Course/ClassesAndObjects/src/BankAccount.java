public class BankAccount {

    private String accountHolderName;
    private String accountNumber;
    private double balance;

    public BankAccount(String accountHolderName,String accountNumber,double balance){
        this.accountHolderName=accountHolderName;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("Deposit amount: "+amount);
        }else{
            System.out.println("You have enter invalid amount");
        }
    }
    public void withdraw(double amount){
        if(amount<=balance && amount>0){
            balance=balance-amount;
            System.out.println("Withdraw amount: "+amount);
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    void checkBalance(){
        System.out.println("your balance is: "+balance);
    }
 void showDetails(){
     System.out.println("Enter Account Holder Name: "+accountHolderName);
     System.out.println("Enter Account Number: "+accountNumber);
     System.out.println("Check your balance: "+balance);
 }
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("Ankit Sharma","B12123C",15000.00);
        bankAccount.showDetails();
        bankAccount.deposit(500);
        bankAccount.withdraw(200);
        bankAccount.checkBalance();


    }
}
