package priority_Thread;

public class Demo_2 extends Thread {
	public void run()
	{
	 System.out.println("Child thread"); 
	System.out.println("Child thread priority : " +Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main thread old priority : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("main hterad new priority : "+Thread.currentThread().getPriority());
		Demo d=new Demo();
		d.start();
	}


}
