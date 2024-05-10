 //4] performing multiple task from multiple thread.

package ThreadCase;

public class ThreadCase_04 extends Thread
{
	public void run()
	{
		System.out.println("Playing Video");
	}
}


class Music extends Thread{
	public void run()
	{
		System.out.println("Playing Music");
	}
}
 
class Progress_bar extends Thread{
	public void run()
	{
		System.out.println("progress bar is exicuting");
	}
}

class Timer  extends Thread
{
	public void run ()
	{
		System.out.println("timer is Executing");
	}
}

class VLC_Media extends Thread{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadCase_4 t4=new ThreadCase_4();
				t4.start();
		Music m=new Music();
		m.start();
		Progress_bar pb=new Progress_bar();
		pb.start();
		Timer tm=new Timer();
		tm.start();
	}
}

