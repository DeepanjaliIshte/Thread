//Write a program to create multiple threads and make the threads to act on single object
	//Multiple Threads acting on single object

package Thread;
public class Reserve implements Runnable 
{
	int available = 1; int 
	wanted; 
	Reserve (int i)
	{
		wanted = i;
	}
	public void run()
	{
		synchronized (this)
		{
			System.out.println ("Number of berths available: " + available); 
			if ( available >= wanted)
			{
				Thread t=Thread.currentThread();
				String name = t.getName (); 
			System.out.println (wanted + " berths alloted to: " + name);
			try
			{
				Thread.sleep(2000); // wait for priniting the ticket 
				available = available - wanted;
			}
			catch (InterruptedException ie)
			{ie.printStackTrace (); }
			}
			else
			{ 
				System.out.println ("Sorry, no berths available");
			}
		}
	}
}

