class A
{
	public synchronized void d1(B b)
	{
		System.out.println("Thread1 starts excution of d1() methods");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Thread1 trying to call B's last() method");
		b.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside A, Last() method");
	}
}
class B
{
	public synchronized void d2(A a)
	{
		System.out.println("Thread2 starts excution of d2() methods");
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println("Thread2 trying to call A's last() method");
		a.last();
	}
	public synchronized void last()
	{
		System.out.println("Inside B, Last() method");
	}
}

public class DeadLock extends Thread{
	A a = new A();
	B b = new B();
	
	public void m1()
	{
		this.start();
		a.d1(b);
	}
	public void run()
	{
		b.d2(a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeadLock t = new DeadLock();
		t.m1();

	}

}
