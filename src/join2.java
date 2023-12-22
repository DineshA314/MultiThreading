class line extends Thread
{
	static Thread mt;
	public void run()
	{
		try
		{
			mt.join();
		}
		catch(InterruptedException e) {
			
		}
		
		for(int i=0; i<10; i++)
		{
			System.out.println("Seetha Thread");
			
		}
	}
}
public class join2 {
public static void main(String[] args) throws InterruptedException{
	line.mt = Thread.currentThread();
	line t = new line();
	t.start();
	//t.join();
	for(int i=0; i<10; i++)
	{
		System.out.println("Ram Thread");
		Thread.sleep(2000);
	}
	
}
}
