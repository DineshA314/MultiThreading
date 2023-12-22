class Myinter extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0; i<10; i++)
		{
			System.out.println("I am lazy thread");
			Thread.sleep(2000);
		}
			
			
			
		}
		catch(InterruptedException e) {
			System.out.println("I got interrupt");
		}
		
	}
}
public class InterruptMethod {
public static void main(String[] args) throws InterruptedException{
	Myinter t = new Myinter();
	t.start();
	t.interrupt();
	
	System.out.println("End the main thread");
	
	
}
}