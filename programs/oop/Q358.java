// Q358
package oop;
public class Q358 {
    static class Account {
        int no;
        String name;
        double bal;
        Account(int no, String name, double bal){ this.no=no; this.name=name; this.bal=bal; }
    }
    static class Bank {
        Account a[] = new Account[10];
        int n = 0;
        void addAccount(Account x){ a[n] = x; n++; }
        void removeAccount(int no){
            for(int i=0;i<n;i++){
                if(a[i].no==no){
                    for(int j=i;j<n-1;j++) a[j] = a[j+1];
                    n--;
                    break;
                }
            }
        }
        Account find(int no){
            for(int i=0;i<n;i++){
                if(a[i].no==no) return a[i];
            }
            return null;
        }
        void deposit(int no, double amt){
            Account x = find(no);
            if(x!=null) x.bal = x.bal + amt;
        }
        void withdraw(int no, double amt){
            Account x = find(no);
            if(x!=null && x.bal>=amt) x.bal = x.bal - amt;
            else System.out.println("Cannot withdraw "+amt+" from account "+no);
        }
        void show(){
            for(int i=0;i<n;i++)
                System.out.println("  #"+a[i].no+" "+a[i].name+" "+a[i].bal);
        }
    }
    public static void main(String[] args) {
        Bank b = new Bank();
        b.addAccount(new Account(101,"Naveen",5000));
        b.addAccount(new Account(102,"Preeti",12000));
        b.deposit(101,2500);
        b.withdraw(102,15000);
        b.withdraw(102,4000);
        System.out.println("Accounts:");
        b.show();
        b.removeAccount(101);
        System.out.println("After closing account 101:");
        b.show();
    }
}
