
public class ThreadLocal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadLocal tl = new ThreadLocal()
		{
			public Object initialValue()   ////// object initialValue
			{
				return "abc";
			}
		};
		System.out.println(tl.get());
		tl.set("dinesh");
		System.out.println(tl.get());
		tl.remove();
		System.out.println(tl.get());

	}

}
