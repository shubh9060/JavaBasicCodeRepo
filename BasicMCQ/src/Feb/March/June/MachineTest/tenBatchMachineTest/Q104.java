package Feb.March.June.MachineTest.tenBatchMachineTest;

interface Bank{
	void deposit(double amount);
	void withdraw(double amount);
	double getBalance();
}
class SavingBank implements Bank{

	double amount,remainBalance;
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		this.amount=amount;
	}

	@Override
	public void withdraw(double wAmount) {
		// TODO Auto-generated method stub
		remainBalance = amount-wAmount;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return remainBalance;
	}
	
}
class CurrentBank implements Bank{

	double amount,remainBalance;
	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		this.amount=amount;
	}

	@Override
	public void withdraw(double wAmount) {
		// TODO Auto-generated method stub
		remainBalance = amount-wAmount;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return remainBalance;
	}
	
}
class BankOperation{
	
	Bank bank;
	public void bankAdaptor(Bank bank) {
		this.bank=bank;
	}
	public void performDeposit(double dAmount) {
		bank.deposit(dAmount);
	}
	public void performWithdraw(double wAmount) {
		bank.withdraw(wAmount);
	}
	public void checkBalance() {
		double rBalance = bank.getBalance();
		System.out.println("Bank Balance Remaining is:"+rBalance);
	}
}
public class Q104 {

	public static void main(String[] args) {
		
		Bank trancations = new SavingBank();
		
		BankOperation savingBankOperation = new BankOperation();
		savingBankOperation.bankAdaptor(trancations); // here we perform the transaction on Saving Bank Class
		savingBankOperation.performDeposit(15000);
		savingBankOperation.performWithdraw(5000);
		savingBankOperation.checkBalance();
		
		trancations = new CurrentBank();
		savingBankOperation.bankAdaptor(trancations);// here we perform the transaction on Current bank class
		savingBankOperation.performDeposit(45000);
		savingBankOperation.performWithdraw(5000);
		savingBankOperation.checkBalance();
		
	}
}
