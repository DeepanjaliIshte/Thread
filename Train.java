
// Write a java program  to achieve thread synchronisation(reserving ticket by multiple user).

public class Train implements Runnable
{
	int avlBreath,widBreath;
	Train(int avlBreath,int WidBreath)
	{
		this.avlBreath=avlBreath;
		this.widBreath=widBreath;
	}
	synchronized public void run()
	{
		try
		{
			System.out.println("Number of available breath: "+avlBreath);
			System.out.println("Number of window breath: "+widBreath);
			Thread t= Thread.currentThread();
			String name=t.getName();
			if(avlBreath<=widBreath)
			{
				Thread.sleep(3000);		// payment
			System.out.println(widBreath+"breaths are reerved for "+name);
			avlBreath=avlBreath-widBreath;
			}
			else {
				System.out.println("Number breath available");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

