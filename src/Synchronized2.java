class Display1
{
	public synchronized void displayn()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.print(i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
		
	}
	public synchronized void displayc()
	{
		for(int i=65; i<=75; i++)
		{
			System.out.print((char)i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
		
	}
}

class Mythread1 extends Thread
{
	Display1 d;
	
	
	Mythread1(Display1 d )
	{
		this.d= d;
		
	}
	public void run()
	{
		d.displayn();
	}
}

class Mythread2 extends Thread
{
	Display1 d;
	
	
	Mythread2(Display1 d )
	{
		this.d= d;
		
	}
	public void run()
	{
		d.displayc();
	}
}
public class Synchronized2 {
public static void main(String [] args)
{
	Display1 d = new Display1();
	
	Mythread1 t1 = new Mythread1(d);
	Mythread2 t2 = new Mythread2(d);
	
	t1.start();
	t2.start();
	
}
}
