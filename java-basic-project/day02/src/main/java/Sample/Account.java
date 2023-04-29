package Sample;

public class Account {
    private Integer balance=12000;
    private Integer accountNumber;
    public Integer withdrawlCount=0;

    public Account(Integer balance,Integer accountNumber) {
        this.balance = this.balance+balance;
        this.accountNumber=accountNumber;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(Integer depositAmount) {
        this.balance = this.balance+depositAmount;
    }

    public void withdraw(Integer withdrawlAmount){
        if(this.balance-withdrawlAmount <500){
            throw new IllegalStateException("insufficient balance ....withdrawl not allowed");
        }
        else if(withdrawlCount<=3){
            this.balance=this.balance-withdrawlAmount;
            this.withdrawlCount=this.withdrawlCount+1;
        }
        else{
            Double charges=(0.3 * Double.valueOf(withdrawlAmount))/100;
            Double deduction=Double.valueOf(withdrawlAmount)+charges;
            this.balance= (int) (this.balance-deduction);
            this.withdrawlCount=this.withdrawlCount+1;

        }
    }

    public void printBalance(){
        System.out.println(this.balance);
    }

}
