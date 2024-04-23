class BankAccount 
{
	private double balance;

	public BankAccount(double initialBalance) 
	{
        		balance = initialBalance;
    	}

    	public synchronized void deposit(double amount) 
	{
        		balance += amount;
        		System.out.println("Deposited: Rs." + amount);
        		System.out.println("Current Balance: Rs." + balance);
    	}

    	public synchronized void withdraw(double amount) throws InsufficientFundsException 
	{
        		if (balance >= amount) 
		{
            			balance -= amount;
            			System.out.println("Withdrawn: Rs." + amount);
            			System.out.println("Current Balance: Rs." + balance);
        		} else 
		{
            			throw new InsufficientFundsException("Not Sufficient Fund");
        		}
    	}
}

class InsufficientFundsException extends Exception 
{
    	public InsufficientFundsException(String message) 
	{
        		super(message);
    	}
}

public class Main2 
{
    	public static void main(String[] args) 
	{
        		BankAccount account = new BankAccount(5000);

        		try 
		{
        			account.deposit(5000);

         			account.withdraw(2000);

            			account.withdraw(1500);

            			account.withdraw(3500);
        		} catch (InsufficientFundsException e) 
		{
            			System.out.println(e.getMessage());
        		}
    	}
}
