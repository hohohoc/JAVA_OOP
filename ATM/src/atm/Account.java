/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;
import java.util.*;

/**
 *
 * @author MR.COOL
 */

public class Account {

	private String accHolder,accNo;
	private double balance;

	public Account(String accHolder, double balance,String accNo) {
		this.accHolder = accHolder;
		this.balance = balance;
                this.accNo = accNo;
	}
        
	public String getAccHolder(){
            return accHolder;
        }
        
        public String getAccNo(){
            return accNo;
        }
        
	public double getBalance(){
		return balance;
	}

	public void updateBalance(double balance){
		this.balance = balance;
	}

	public void printAccDetails(){
		System.out.println("Account Holder: "+accHolder);
                System.out.println("Account Number: "+accNo);
		System.out.println("Account balance: "+balance);
	}
}
