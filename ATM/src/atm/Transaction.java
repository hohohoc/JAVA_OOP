
package atm;

import java.text.SimpleDateFormat;
import java.util.*;

public class Transaction {
        private String trancid = UUID.randomUUID().toString();
        private SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
        private Date date = new Date();
        private double amount;

        public Transaction(){}
        
        public String returnID()
        {
            return trancid.substring(0,5);
        }
        
        public String returnDate()
        {
            return formatter.format(date);
        }
        
        public double StringToDouble(String a){
            amount = Double.parseDouble(a);
            return amount;
        }

	public void getSummaryLine(){
            System.out.println ("Transaction ID : "+trancid); 
	    System.out.println(formatter.format(date)); 
	}        
}