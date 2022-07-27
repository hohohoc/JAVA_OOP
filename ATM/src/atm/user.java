/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author MR.COOL
 */

public class user{
	private String cardNo;
	private String pin;
	private Account acct;

	public user()
	{

	}

	public user(String cardNo,String pin,Account account)
	{
		this.cardNo=cardNo;
		this.pin=pin;
                acct = account;
	}

        public Account returnAcc(){
            return acct;
        }
        
	 public void linkAccount(Account account){
	 	this.acct = account;
	 }
         
         public String returnAccHolder()
         {
             return acct.getAccHolder();
         }
         
         public String returnAccNo()
         {
             return acct.getAccNo();
         }
     
         public String getCardNo()
         {
             return cardNo;
         }
         
         public double returnBalance(){
	 	return acct.getBalance();
	 }
         
         public String getPinNo()
         {
             return pin;
         }
         
	public void printDetails(){
		System.out.println("User's card number: "+cardNo);
		System.out.println("User's PIN number: "+pin);
                acct.printAccDetails();
	}
        
        
}