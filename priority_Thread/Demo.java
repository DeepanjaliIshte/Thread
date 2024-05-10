package priority_Thread;

public class Demo extends Thread
{
	public void run()
	{
	 System.out.println("Child thread"); 
	System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getPriority());
		Demo d=new Demo();
		d.start();
	}

}
