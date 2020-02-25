package yourname.assignment.main;

import yourname.assignment.data.Data;
import yourname.assignment.singleton.SingleTon;

public class Main {

	public static void main(String[] args) {
		Data data = new Data();
		data.printDetails();
		//data.localPrint();
		
		SingleTon singleTon = new SingleTon();
		//System.out.println(singleTon.staticMethod("Some String"));
		singleTon.print();
	}

}
