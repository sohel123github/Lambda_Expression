package work;

public class ThreadDemo {
	public static void main(String[] args) {
		
		Runnable thread1 = () -> {
			for (int i=1; i<=10; i++) {
				System.out.println("value of i is " +i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t1=new Thread(thread1);
		t1.setName("John");
		t1.start();
		
		Runnable thread2 = () -> {
			for (int i=1; i<=10; i++) {
				System.out.println("value " +5 * i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		Thread t2=new Thread(thread2);
		t2.setName("Ram");
		t2.start();
		
		
	}
}
