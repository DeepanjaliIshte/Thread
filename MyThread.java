//  Write a program to create and run a Thread
//creating and running a Thread

public class MyThread implements Runnable
{
	public void run() 
	{
		for(int i=0;i<100;i++)
		{
			System.out.print(i+"\t");
		}
	}
}
