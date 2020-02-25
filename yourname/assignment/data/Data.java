package yourname.assignment.data;

public class Data {

	private int var1;
	private char var2;
	
	public void printDetails() {
		System.out.println("Variable 1: " + var1 + "\nVariable 2: " + var2);
	}
	
	/*public void localPrint() {
		int localVar1;
		char localVar2;
		System.out.println("Variable 1:" + localVar1 + "\nVariable 2: " + localVar2);
	}*/
	
	/*
	 * The above method results in a compile-time error.
	 * This is because the variables are local to the method and are not initialized.
	 * Local variables are generally created to perform an operation and hence it's the programmer's decision to set the values.
	 * While the first method printDetails() doesn't result in an error because these are instance variables and are assigned default values when an object of the class is created.
	 */

}
