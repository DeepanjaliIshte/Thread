package Dameon_Thread;

public class Dameon_Test extends Thread {
	public void run() 
	{
		//System.out.println(Thread.currentThread().isDaemon());
		System.out.println("Child thread");//Dameon thread
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread");
		
		Dameon_Test dt=new Dameon_Test();
		dt.setDaemon(true);
		dt.start();
	}

}
