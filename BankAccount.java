//Encapsulation practice
public class BankAccount {
    private int accountNumber;
    private double balance;

    public void setAccNum(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBal(double balance){
        this.balance = balance;
    }

    public int getAccNum(){
        return accountNumber;
    }

    public double getBal(){
        return balance;
    }
}
