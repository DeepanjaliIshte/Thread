
public class ThreadName_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Thread.currentThread().setName("Deepanjali");
		System.out.println(Thread.currentThread().getName());
		System.out.println(10/0);	//Exception in Thread "main"
	}

}
