package atm;
public class Transfer extends Transaction{
    private user[] u;
    private user recipient;
    private int recipientNo;
    private Account acc;
    private int match = 0;
    private double amount;
    private int totalUser;
    
    
    public Transfer(Account acc,double amount,user recipient){
        this.acc = acc;
        this.amount = amount;
        this.recipient=recipient;
        TransferProcess(amount);
    }
    
    public int getRecipientNo(){
        return recipientNo;
    }
    
    public String returnReceiptName()
    {
        return acc.getAccHolder();
    }
    
    public void TransferProcess(double amount){
        acc.updateBalance(acc.getBalance()-amount);
        recipient.returnAcc().updateBalance(amount+recipient.returnBalance());
    }
    
    public void getSummaryLine(){
        super.getSummaryLine();
        System.out.println("Your account balance :" + acc.getBalance());
        System.out.println("Recipient :" + recipient.getCardNo());
        System.out.println("Transfer Amount: RM "+ amount);
    }
    
}
