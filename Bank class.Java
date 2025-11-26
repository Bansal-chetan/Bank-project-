• package Bank;
public class BankDetails {
 String name;
 private int accountNumber;
 String IFSC;
 final static String BANK_NAME = "PUNJAB & SIND BANK";
 Double balance;
 static int numofAccount;
 public BankDetails(String name, String IFSC, Double balance) {
 this.name = name;
 this.IFSC = IFSC;
 this.balance = balance;
 numofAccount++;
 this.accountNumber = numofAccount;
 }
 public int getAccountNumber() {
 return this.accountNumber;
 }
 public String getName() {
 return this.name;
 }
 public String getIFSC() {
 return this.IFSC;
 }
 public Double getBalance() {
 return this.balance;
 }
 public static String getBankName() {
 return BANK_NAME;
 }
}
