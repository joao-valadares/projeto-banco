package entities;

public class account {

   private int accountNumber;
   private String accountName;
   private double accountAmount;
   
public account(int accountNumber, String accountName, double accountAmount) {
    this.accountNumber = accountNumber;
    this.accountName = accountName;
    depositAmount(accountAmount);
}

public int getAccountNumber() {
    return accountNumber;
}

public String getAccountName() {
    return accountName;
}

public double getAccountAmount() {
    return accountAmount;
}

public void setAccountName(String accountName) {
    this.accountName = accountName;
}

public double depositAmount(double depositAmount){
    return this.accountAmount += depositAmount;
}

public double withdrawAmount(double withdrawAmount){
    if (withdrawAmount > 0){
    return this.accountAmount -= withdrawAmount + 5;
    }
    else {
        return this.accountAmount;
    }
}
   



}