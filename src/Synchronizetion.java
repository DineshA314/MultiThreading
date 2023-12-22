class Display
{
	public synchronized void wish(String name)
	{
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
		
	}
}

class MythreadS extends Thread
{
	Display d;
	String name;
	
	MythreadS(Display d , String name)
	{
		this.d= d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}
public class Synchronizetion {
public static void main(String [] args)
{
	Display d = new Display();
	
	MythreadS t1 = new MythreadS(d,"dhoni");
	MythreadS t2 = new MythreadS(d,"yuvraj");
	
	t1.start();
	t2.start();
	
}
}
