
public class MyThread_Demo
{
	public static void main(String[] args) 
	{
		MyThread mt= new MyThread();
		Thread t= new Thread(mt);
		t.start();
	}
}
