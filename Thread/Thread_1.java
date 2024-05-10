package Thread;

public class Thread_1 extends Thread
{
	public void run()
	{
		System.out.println("Thread is running ...");
	}
	public static void main(String[] args)
	{
		Thread t= new Thread();
		t.start();
	}
}
