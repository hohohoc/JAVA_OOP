
package atm;

/**
 *
 * @author Jasmine
 */

public class Deposit extends Transaction{
    private Account acc;
    
    
    public Deposit(Account acc,double a){
        this.acc = acc;
        DepositProcess(a);
    }
    
    public void DepositProcess(double amount){
        acc.updateBalance((amount+acc.getBalance()));
    }
    
    public void getSummaryLine(){
        super.getSummaryLine();
        System.out.println("New Balance: RM "+ acc.getBalance());
    }
   
    
    
    
}
