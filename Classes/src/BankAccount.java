import com.sun.jdi.Value;

public class BankAccount {
    private int accountNumber;
    private double balance = 0.00;
    private String customerName;
    private String email;
    private String phoneNumber;

    //Setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    //Getters
    public double getBalance(){
        return this.balance;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public String getEmail(){
        return this.email;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String depositMoney(double amount){
        this.balance += amount;
        return "New Bank balance is : "+this.balance;
    }
    public String withdrawMoney(double amount){
        if(this.balance >= amount){
            this.balance -= amount;
            return String.valueOf(this.balance);
        }else {
            return "Insufficient  bank balance";
        }
    }
}
