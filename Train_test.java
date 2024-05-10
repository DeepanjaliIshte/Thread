import java.util.Scanner;

public class Train_test {
	public static void main(String[] args) {
	Scanner sn =new Scanner(System.in);
	System.out.println("Enter available Breths: ");
	int ab=sn.nextInt();
	System.out.println("Enter window Breths ");
	int wb=sn.nextInt();
	System.out.println();
	Train tr= new Train(wb, wb);
			//First passenger
	Thread  t1=new Thread(tr);
	t1.setName("First User");
	t1.start();
	//Second passenger
	Thread t2= new Thread(tr);
	t2.setName("Second User");
	t2.start();
	}
}
