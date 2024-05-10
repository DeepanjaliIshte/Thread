package Dameon_Thread;

public class Dameon_Test_2 {
	public void run() 
	{
		if(Thread.currentThread().isDaemon())
		{
			 System.out.println("daemon thread");
		}
		else {
		System.out.println("Child thread");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread");
		
		Dameon_Test dt=new Dameon_Test();
		dt.setDaemon(true);
		dt.start();
	}

}
