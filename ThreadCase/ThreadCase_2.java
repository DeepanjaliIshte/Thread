//2] performing single task from multiple Thread

package ThreadCase;

public class ThreadCase_2 extends Thread
{
	public void run()
	{
		System.out.println("Thread Task");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCase_1 t1=new ThreadCase_1();
				t1.start();
		ThreadCase_2 t2=new ThreadCase_2();
		t2.start();
		//Test t3=new Test();
		//t2.start();
	}
}
