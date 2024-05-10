//1] performing single task from Single Thread

package ThreadCase;
public class ThreadCase_1 extends Thread {
	public void run()
	{
		System.out.println("Thread Task");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCase_1 t1=new ThreadCase_1();
				t1.start();
	}

}
