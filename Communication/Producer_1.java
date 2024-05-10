//Write a program to demonstrate Thread communication 
//inter thread communication

package Communication;
public class Producer_1 implements Runnable {
	StringBuffer sb; 
	Producer_1 ()
	{
		sb = new StringBuffer();
	}
	public void run (){
		synchronized (sb)
		{
			for (int i=1;i<=5;i++){
				try{
						sb.append (i + " : "); 
						Thread.sleep (500); 
						System.out.println (i + " appended");
				}
				catch (InterruptedException ie){}
			}
			sb.notify ();
		}
	}
}
