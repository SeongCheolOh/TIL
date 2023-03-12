package javaCh14.p600;

public class ThreadSleepEx01 {

	public static void main(String[] args) {
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 2; i<10; i++) {
					for(int j = 1; j<10; j++) {
						System.out.print(i + "X" +j+"="+i*j+"\t");
					}System.out.println();
				}
				
			}
		});
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				
					try {
						t2.start();
						t2.join();
						Thread.sleep(10);
						
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					for(int i = 0; i<50; i++) {
						System.out.println("-----");
					}
					
			}
		});
		
		t1.start();
		
	}

}
