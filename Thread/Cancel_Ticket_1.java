
//to cancel the ticket
package Thread;
public class Cancel_Ticket_1 extends Thread
{
	Object train,comp;
	public Cancel_Ticket_1(Object train,Object Comp) {
		this.train=train;
		this.comp=Comp;
	}
	public void run(){
		synchronized(comp){
		 System.out.println("Cancel ticket has lcked on compartment");
		 try {
			 Thread.sleep(2000);
		 }
		 catch(InterruptedException ie) {}
		 System.out.println("Cancel ticket tries to lock train object");
		synchronized (train) {
			System.out.println("Cancel ticket has locked train");
		}
		}
	}
}
