
class DivideByZeroException extends Exception
{
    	public DivideByZeroException() 
	{
        		super("Divide by Zero Error: Cannot divide by zero.");
    	}
}
public class DivideByZeroExample 
{
	public static double divide(double numerator, double denominator) throws DivideByZeroException 
	{
        		if (denominator == 0) 
		{
            			throw new DivideByZeroException();
        		}
        		return numerator / denominator;
    	}

public static void main(String[] args) 
{
	double numerator = 10;
        	double denominator = 0;

        	try 
	{
            		double result = divide(numerator, denominator);
            		System.out.println("Result: " + result);
        	} 
	catch (DivideByZeroException e) 
	{
            		System.out.println("Error: " + e.getMessage());
        	}
    }
}
