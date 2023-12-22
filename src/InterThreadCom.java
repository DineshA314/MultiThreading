

public class InterThreadCom {
public static void main(String [] args) throws Exception {
	ThreadB b = new ThreadB();
	b.start();
	synchronized(b)
	{
		System.out.println("Main thread caling wait");
		b.wait();
		System.out.println("Main thread got notifycation");
		System.out.println(b.total);
		
	}
	
}
}

class ThreadB extends Thread
{
	int total=0;
	
	public void run() 
	{
		synchronized(this)
		{
			System.out.println("child thread start cal");
			
			for(int i=1; i<=100; i++)
			{
				total = total + i;
			}
			System.out.println("child thread giving not");
			this.notify();
			
		}
		
	}
}