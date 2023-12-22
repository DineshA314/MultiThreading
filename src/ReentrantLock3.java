import java.util.concurrent.locks.*;

class Mythread4 extends Thread
{
	static ReentrantLock l = new ReentrantLock();
	
	Mythread4(String name)
	{
		super(name);
	}
	public void run()
	{
		if(l.tryLock())
		{
			System.out.println(Thread.currentThread().getName()+ " .....got lock and performing safe operations");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e)
			{
				
			}
			l.unlock();
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+ " .....unable to get lock and performing alternative operations");
		}
	}
}
public class ReentrantLock3 {
public static void main(String[] args)
{
	Mythread4  t1 = new Mythread4("First thread");
	Mythread4  t2 = new Mythread4("second thread");
	t1.start();
	t2.start();
}
}
