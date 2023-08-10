package Work;

public class Main {

	public static void main(String[] args) {
		System.out.println("My System Start ");
		
		//implementing interface using lambda expression
		//*************************************************
		
		MyInterface interface1 = () -> System.out.println("This is first time i m using lambda ");
		interface1.sayHello();
		
		MyInterface interface2 = ()-> System.out.println("This is second time i m using lambda");	
		interface2.sayHello();
		
		
		
		//**************************************************
		//MyInterface interface1=new MyInterfaceImp();
		//interface1.sayHello();
		
//		MyInterface myInterface = new MyInterface() {
//			
//			@Override
//			public void sayHello() {
//				System.out.println("This is my first annonymous class");
//				
//			}
//		};
//		myInterface.sayHello();
//		
//		MyInterface myInterface2 = new MyInterface() {
//			
//			@Override
//			public void sayHello() {
//				System.out.println("This is my second annonymous class");
//				
//			}
//		};
//
	}

}
