// Q276
package inheritance;
public class Q276 {
    static abstract class BankAccount {
        double money;
        BankAccount(double m){ money = m; }
        abstract void deposit(double amt);
        abstract void withdraw(double amt);
    }
    static class SavingsAccount extends BankAccount {
        SavingsAccount(double m){ super(m); }
        void deposit(double amt){ money += amt; System.out.println("Savings deposit "+amt+" -> "+money); }
        void withdraw(double amt){
            if(amt>money) System.out.println("Savings: insufficient balance");
            else { money -= amt; System.out.println("Savings withdraw "+amt+" -> "+money); }
        }
    }
    static class CurrentAccount extends BankAccount {
        CurrentAccount(double m){ super(m); }
        void deposit(double amt){ money += amt; System.out.println("Current deposit "+amt+" -> "+money); }
        void withdraw(double amt){
            if(money-amt < -2000) System.out.println("Current: overdraft limit of 2000 exceeded");
            else { money -= amt; System.out.println("Current withdraw "+amt+" -> "+money); }
        }
    }
    public static void main(String[] args) {
        BankAccount a = new SavingsAccount(5000);
        BankAccount b = new CurrentAccount(1000);
        a.deposit(1500);
        a.withdraw(9000);
        b.withdraw(2500);
        b.withdraw(1000);
    }
}
