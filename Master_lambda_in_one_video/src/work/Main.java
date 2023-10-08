package work;

public class Main {
	
	public static void main(String[] args) {
		
//		System.out.println("My system starts..");
		
		// create seperate class and implements this interface-
	/*	MyInterImpl myInterImpl = new MyInterImpl();
		myInterImpl.sayHello();
		
		MyInter myInter = new MyInterImpl();
		myInter.sayHello();	*/
		
		//anonymous class for implementing interface-
	/*	MyInter i=new MyInter() {
			
			@Override
			public void sayHello() {
				System.out.println("this is first anonymous class..");
			}
		};
		i.sayHello();
		
		MyInter i2=new MyInter() {
			
			@Override
			public void sayHello() {
				System.out.println("this is second anonymous class.. ");
			}
		};
		i2.sayHello();*/
		
		//lambda expression-
		/*MyInter i=()->{
			System.out.println("this is first class..");
		};
		i.sayHello();*/
		
		//if there is only one statement in then there is need to 
		//provide curly bracket-
		/*MyInter i2= ()->System.out.println("this is second class..");
		i2.sayHello();*/
		
		//Sum of two No. return-
	/*	SumInter si= (int a, int b ) ->{
			return a + b;
		};
		System.out.println(si.sum(5, 10));
		System.out.println(si.sum(8, 2));*/
		
	/*	SumInter si= (a, b) ->  a + b;
		
		System.out.println(si.sum(10, 10));
		System.out.println(si.sum(8, 7));*/
		/*
		LengthInter li = (str -> str.length());
		
		System.out.println(li.getLength("Sohel Patvekar"));*/
		
		/*LengthInter li = str -> str.length();
		
		System.out.println(li.getLength("Sohel"));*/
		
		
		
		
	}
}
