
class DivisibleBy3Thread extends Thread 
{
    	public void run() 
	{
        		System.out.println("Numbers divisible by 3:");
        		for (int i = 1; i <= 50; i++) 
		{
            			if (i % 3 == 0) 
			{
                				System.out.println(i);
            			}
        		}
    	}
}

class DivisibleBy5Thread extends Thread 
{
    	public void run() 
	{
        		System.out.println("Numbers divisible by 5:");
        		for (int i = 1; i <= 50; i++) 
		{
            			if (i % 5 == 0) 
			{
                				System.out.println(i);
            			}
        		}
    	}
}


public class Main4 
{
    	public static void main(String[] args) 
	{
   
        		DivisibleBy3Thread thread1 = new DivisibleBy3Thread();
        		DivisibleBy5Thread thread2 = new DivisibleBy5Thread();
        
        		thread1.start();
        		thread2.start();
    	}
}
