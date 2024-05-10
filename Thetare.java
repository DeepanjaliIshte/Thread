
//Write a program to create more than one thread
//using more than one thread is called MultiThreading

public class Thetare extends Thread
{
	String str;
	public Thetare(String str)
	{
		this.str=str;
	}
	public void run(){
		for (int i=1;i<=10;i++){
			System.out.println(str+":"+i);
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
}
