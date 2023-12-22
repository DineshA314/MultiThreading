import java.util.concurrent.locks.*;

class Display2
{
	ReentrantLock l = new ReentrantLock();
	
	public  void wish(String name)
	{
		l.lock();
		for(int i=0; i<3; i++)
		{
			System.out.print("Good Morning :");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}
			System.out.println(name);
		}
		l.unlock();
		
	}
}

class Myth extends Thread
{
	Display2 d;
	String name;
	
	Myth(Display2 d , String name)
	{
		this.d= d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
public class ReentrantLock2 {
public static void main(String [] args)
{
	Display2 d = new Display2();
	
	Myth t1 = new Myth(d,"dhoni");
	Myth t2 = new Myth(d,"yuvraj");
	
	t1.start();
	t2.start();
	
}
}
