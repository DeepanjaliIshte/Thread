// Que=> Write a program to know the currently running Thread
// Currently running thread

public class Current {

	public static void main(String[] args) {
		System.out.println("This is first statement ");
		Thread t= new Thread();
		System.out.println("Current Thread: "+t);
		System.out.println("Its name: "+t.getName());
		System.out.println("Its priority: "+t.getPriority());
	}

	public static String Thread() {
		// TODO Auto-generated method stub
		return null;
	}
}


