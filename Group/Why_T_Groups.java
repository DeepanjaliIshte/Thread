package Group;
public class Why_T_Groups 
{
	public static void main (String[] args)
	{
		Reservation res= new Reservation();
		Cancellation can = new Cancellation();// Create Thread Group
		ThreadGroup tg= new ThreadGroup("Reservation Group"); 
		// Create 2 thread Grou and add them to thread group
		Thread t1=new Thread(tg,res,"First Thread");
		Thread t2=new Thread(tg,res,"Second Thread");
		// Create another thread group as a child to tg
		ThreadGroup tg1=new ThreadGroup(tg,"Cancellation Group");
		Thread t3 = new Thread (tg1, can, "Third Thread");
		Thread t4 = new Thread (tg1, can, "Fourth Thread"); //find parent group of tg1
		System.out.println ("Parent of tg1 = " + tg1.getParent ());
		System.out.println();
		//set maximum priority
		tg1.setMaxPriority (7);
		System.out.println ("Thread group of t1 = " + t1.getThreadGroup ());
		System.out.println();
		System.out.println ("Thread group of t3 = " + t3.getThreadGroup ());
		System.out.println();
		t1.start ();
		t2.start ();
		t3.start ();
		t4.start ();
		System.out.println ("Number of threads in this group : " + tg.activeCount ());
	}
}
		
		
		

