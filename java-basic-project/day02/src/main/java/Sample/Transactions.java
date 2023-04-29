package Sample;

//import java.time.LocalDate;

public class Transactions {
    private Integer accountNumber;
    private Integer amount;
    private String type;

    public Transactions(Integer accountNumber, Integer amount, String type) {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.type = type;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "accountNumber=" + accountNumber +
                ", amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }
}
