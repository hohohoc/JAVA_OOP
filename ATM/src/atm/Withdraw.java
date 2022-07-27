
package atm;

/**
 *
 * @author Jasmine
 */
public class Withdraw extends Transaction{
    private Account acc;
    
    public Withdraw(Account acc,double amount){
        this.acc = acc;
        WithdrawProcess(amount);
    }
    
    public void WithdrawProcess(double amount){
        acc.updateBalance((acc.getBalance()-amount));
    }
    
    public void getSummaryLine(){
        super.getSummaryLine();
        System.out.println("New Balance: RM"+ acc.getBalance());
    }
   
    
    
    
}
    