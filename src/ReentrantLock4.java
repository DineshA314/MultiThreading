import java.util.concurrent.locks.*;
import java.util.concurrent.TimeUnit;

class Mythread5 extends Thread
{
	static ReentrantLock l = new ReentrantLock();
	Mythread5(String name)
	{
		super(name);
	}
	public void run()
	{
		do
		{
			try {
				if (l.tryLock(3000, TimeUnit.MILLISECONDS))
				{
					System.out.println(Thread.currentThread().getName()+"....got lock");
					Thread.sleep(25000);
					l.unlock();
					System.out.println(Thread.currentThread().getName()+"....releases lock");
					break;

				}
				else
				{
					System.out.println(Thread.currentThread().getName()+"...unable to get lock and will try again");

				}
			}catch(Exception e) {
				
			}
		}while(true);
	}
}
public class ReentrantLock4 {
public static void main(String [] args)
{
	Mythread5 t1 = new Mythread5("first Thread");
	Mythread5 t2 = new Mythread5("second Thread");
     t1.start();
     t2.start();

}
}
