package Bank;
public class bankuse {
 public static void main(String[] args) {
 BankDetails account1 = new BankDetails("chetan", "PSIB0001234", 
1500.50);
 BankDetails account2 = new BankDetails("chirag", "PSIB0005678", 
25000.75);
 System.out.println("Bank: " + BankDetails.getBankName());
 System.out.println("Account Holder: " + account1.getName());
 System.out.println("Account Number: " + account1.getAccountNumber());
 System.out.println("IFSC Code: " + account1.getIFSC());
 System.out.println("Current Balance: " + account1.getBalance());
 System.out.println("Account Holder: " + account2.getName());
 System.out.println("Account Number: " + account2.getAccountNumber());
 System.out.println("IFSC Code: " + account2.getIFSC());
 System.out.println("Current Balance: " + account2.getBalance());
 }
}
