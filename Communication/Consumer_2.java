package Communication;

public class Consumer_2 implements Runnable {
		Producer_1 prod;
		Consumer_2 (Producer_1 prod){
			this.prod = prod;
		}
		public void run()
		{
			synchronized (prod.sb) {
				try{
			 prod.sb.wait ();
				}
			catch (Exception e) {
				System.out.println (prod.sb);
			}
		}
   }
}