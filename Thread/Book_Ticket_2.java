
// to book the ticket
package Thread;
public class Book_Ticket_2 {
	Object train,comp;{
		this.train=train;
		this.comp=comp;
	}
	public void run(){
		synchronized (train) {
			System.out.println("Book ticket has loacked on train");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException ie) {}
			System.out.println("Book ticket tries to lock train object");
			synchronized (comp) {
				System.out.println("Book ticket has locked compartment");
			}
		}
	}
}
