package Communication;

public class Communicate_3 {
	public static void main(String args[])
	{
		Producer_1 pd = new Producer_1 ();
		Consumer_2 cs = new Consumer_2 (pd);
		Thread t1 = new Thread (pd);
		Thread t2 = new Thread(cs);
		t2.start ();
		t1.start ();
	}
}



