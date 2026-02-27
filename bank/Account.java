package bank;

public class Account {
    public String name;

   protected String email;
   private String password;


   public void setPassword(String password) {
       this.password = password;
   
}

    // private double balance;

    // public Account(String name, double balance) {
    //     this.name = name;
    //     this.balance = balance;
    // }

    // public String getName() {
    //     return name;
    // }

    // public double getBalance() {
    //     return balance;
    // }

    // public void deposit(double amount) {
    //     balance += amount;
    // }

    // public void withdraw(double amount) {
    //     if (amount <= balance) {
    //         balance -= amount;
    //     } else {
    //         System.out.println("Insufficient funds");
    //     }
    // }
}

