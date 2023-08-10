package Work2;

public class ThreadDemo {

	public static void main(String[] args) {
		// First Thread--thread john
		
		Runnable thread1 = ()->{
			// body of the thread
			
			for(int i=0;i<=10;i++) {
				System.out.println("Value of i is : " +i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		
		Thread t = new Thread(thread1);
		t.setName("John");
		t.start();
		
		Runnable thread2 = ()->{
			for(int i=0;i<=10;i++) {
				
				System.out.println(i*2);
				 
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		};
		Thread t2 = new Thread(thread2);
		t2.setName("Ajit");
		t2.start();
		
		

	}

}
