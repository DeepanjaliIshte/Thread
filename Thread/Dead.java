package Thread;
public class Dead {
	public static void main(String[] args) {
		Object compartment =new Object();
		Cancel_Ticket_1 ct= new Cancel_Ticket_1(train,compartment); 
		Book_Ticket_2 bt=new Book_Ticket_2();
		Thread t1=new Thread(ct);
		Thread t2=new Thread((Runnable) bt);
		t1.start();
		t2.start();			
	}
}
