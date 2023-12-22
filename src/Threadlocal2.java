class ParentThread extends  Thread
{
	//static ThreadLocal tl = new ThreadLocal();                  //child value is null
	static InheritableThreadLocal tl = new InheritableThreadLocal()     ///child value is parent value
			{
		         public Object c=-hildValue(Object p)
		         {
		        	 return "abi";
		         }
		
			};
	public void run()
	{
		tl.set("dinesh");
		System.out.println("parent value : " + tl.get());
		ChildThread ct = new ChildThread();
		ct.start();
	}
}
class ChildThread extends Thread
{
	public void run()
	{
		System.out.println("child value : " + ParentThread.tl.get());
	}
}

public class Threadlocal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentThread pt = new ParentThread();
		pt.start();

	}

}
