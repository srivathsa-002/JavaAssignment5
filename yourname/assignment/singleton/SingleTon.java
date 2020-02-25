package yourname.assignment.singleton;

public class SingleTon {
	private String var;
	/*public static SingleTon staticMethod(String var1) {
		var = var1;
		return new SingleTon();
	}*/
	
	/*
	 * The above functions results in a compile-time error.
	 * This is because, we are trying to make a static reference to a non-static field 'var'.
	 * Static methods are available once the class is loaded to JVM.
	 * Non-static variables/methods exist only when an object is created to a class.
	 * Here a non-static 'var' is not even created as the class object is not even created.
	 * Hence, it results in an error.
	 */
	
	public void print() {
		System.out.println("String member variable: " + var);
	}
}
