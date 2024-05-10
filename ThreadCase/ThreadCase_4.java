// 4] performing multiple task from multiple thread.

package ThreadCase;

public class ThreadCase_4 extends Thread
{
	public void run()
	{
		System.out.println("Thread Task 1");
	}
}


class Test extends Thread{
	public void run()
	{
		System.out.println("Thread Task 2");
	}
}


class Main extends Thread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCase_4 t4=new ThreadCase_4();
				t4.start();
		Test t=new Test();
		t.start();
	}
}
