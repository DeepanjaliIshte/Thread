package Thread;
abstract class Thread_2 implements Runnable
{
	 public void run()
	 {
		 System.out.println("Thread is running");
	 }
	public static void main(String[] args) 
	{	
		Thread_1 T= new Thread_1();
		T.start();
	}

}
