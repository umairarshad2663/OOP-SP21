package lab3_home_activity_2;



import java.util.Scanner;



public class accountRunner {
    public static void main(String args[]){
        account a1= new account();
        a1.Account();
        System.out.println("Your Current Balance is : 1050");
        System.out.println("Press 1 to deposit Funds or Press 2 to Withdrew Funds : ");
        Scanner s1=new Scanner(System.in);
        int choice = s1.nextInt();
        
        if (choice==1){
            a1.Deposit(200);
        }
        else{
          a1.Withdraw(100);  
        }
       
        System.out.println("Enter Your Balance: ");
        int a= s1.nextInt();
        a1.Account(a);
        
        System.out.println("Press 1 to deposit Funds or Press 2 to Withdrew Funds : ");
        
        
        choice = s1.nextInt();
        
        if (choice==1){
           a= s1.nextInt();
            a1.Deposit(a);
        }
        else{
            a= s1.nextInt();
          a1.Withdraw(a);  
        }
    }
}
