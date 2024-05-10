//1] performing single task from Single Thread


package ThreadCase;

public class ThreadCase_01 extends Thread {
	public void run()
	{
		System.out.println("Thread Task");
	}
}
class TestThread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCase_01 t01=new ThreadCase_01();
		t01.start();
	}

}
