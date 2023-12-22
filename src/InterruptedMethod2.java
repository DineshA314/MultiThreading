class Myinter2 extends Thread
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("I am lazy thread");
		}
		System.out.println("going to sleep method");
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.out.println("I got interrupt");
		}
		
	}
}
public class InterruptedMethod2 {
public static void main(String[] args) throws InterruptedException{
	Myinter2 t = new Myinter2();
	t.start();
	
	t.interrupt();
	
	System.out.println("End the main thread");
	
	
}
}