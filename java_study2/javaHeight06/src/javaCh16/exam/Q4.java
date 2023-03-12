package javaCh16.exam;

public class Q4 {
	
	public static void main(String[] args) {
		
		Thread thread = new Thread( new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<3; i++) {
					System.out.println("작업 스레드가 실행됩니다.");
				}
			}
		});
		
		//람다식 표현
		Thread thread1 = new Thread(()-> {
			for(int i = 0; i<3; i++) {
				System.out.println("작업 스레드가 실행됩니다.");
			}
		});
		thread1.start();
	}

}
