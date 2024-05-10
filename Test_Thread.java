
public class Test_Thread extends Thread
{
	public void run() {
		System.out.println("Thread task is executed by "+Thread.currentThread().getName());
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Hello is printed by  "+Thread.currentThread().getName());	//first way to print name
		
		Test_Thread tt=new Test_Thread();
		tt.setName("Ishte");	//second way to print name
		tt.start();
		
		Test_Thread t1=new Test_Thread();
		t1.setName("Deepanjali");
		t1.start();
	
		System.out.println(Thread.currentThread().isAlive());
	}

}
