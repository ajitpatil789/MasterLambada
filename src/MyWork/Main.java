package MyWork;

public class Main {

	public static void main(String[] args) {
		// Code done by Ajit
//		MyInter inter = new MyInterImpl();
//		inter.sayHi();
		
//		MyInter inter = new MyInter() {
//			
//			@Override
//			public void sayHi() {
//				System.out.println("implemented using annonymous class");
//				
//			}
//		};
//		inter.sayHi();
		
		// using lambda
		MyInter inter = ()-> System.out.println("Implemented using Lambda");
		inter.sayHi();

	}

}
