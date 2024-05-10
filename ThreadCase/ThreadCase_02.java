//2] performing single task from multiple Thread

package ThreadCase;

public class ThreadCase_02 extends Thread {
	public void run()
	{
		System.out.println("task 1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCase_02 t02=new ThreadCase_02();
		t02.start();
		ThreadCase_02 t03=new ThreadCase_02();
		t03.start();
		ThreadCase_02 t04=new ThreadCase_02();
		t04.start();
		ThreadCase_02 t05=new ThreadCase_02();
		t05.start();
		
	}

}
