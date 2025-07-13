class account{
    String name;
    int balance;
    account(String name,int balance){
        this.name=name;
        this.balance=balance;
        System.out.println("Name of the account holder:"+name+"balance:"+balance);

    }
    public void deposit(int amount){
        balance+=amount;
        System.out.println("after deposit"+amount+"balance is:"+balance);
    }
    public void withdraw(int retr){
        if(balance>=retr){
            balance-=retr;
            System.out.println("agter withdraw"+balance);

        }
        else{
            System.out.println("insufficient funds");
        }
    }
}
public class system{
    public static void main(String[]args)
    {
        account a=new account("vikram",10000);
        a.deposit(25000);
        a.withdraw(10000);
        
    }
}