
package lab3_home_activity_2;
public class account {
    private int balance;
    private int x;
    private int y;
    public void Account(){
        balance=1050;

    }
    
    public void Account(int a){
        balance=a;
    }
    
    public void Deposit(int a){
        balance=balance+a;
        System.out.println("You deposited "+ a+"Rs.\n New balance is : "+balance);
        
    }
    
    public void Withdraw(int a){
        balance=balance-a;
        System.out.println("You Withdrew "+ a+"Rs.\n New balance is : "+balance);
    }

    public void account() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
