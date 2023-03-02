package javaCh14.p600;

public class ThreadNameEx01 {

	public static void main(String[] args) {
		//p.600 스레드 이름
		Thread mainThread = Thread.currentThread();
		String threadName = mainThread.getName();
		System.out.println(threadName);
		
		ThreadNameEx01_1 ph = new ThreadNameEx01_1();
		Thread t1 = new Thread(ph);
		t1.start();
		
		ThreadNameEx01_2 yt = new ThreadNameEx01_2();
		Thread t2 = new Thread(yt);
		t2.start();
//		yt.start();
		
		//ph의 스레드이름 알기
		System.out.println(t1.currentThread().getName());
		System.out.println(t2.currentThread().getName());
//		System.out.println(yt.currentThread().getName());
		
		t1.currentThread().setName("전화걸기1");
		t2.currentThread().setName("유튜브보기1");
		
		System.out.println(t1.currentThread().getName());
		System.out.println(t2.currentThread().getName());
		
		System.out.println(t1.currentThread().getPriority());
		
		//우선순위 1~10까지 1이 제일 빠르게 처리, 10이면 제일 느리게 처리하는 것
		t1.currentThread().setPriority(1);
		t2.currentThread().setPriority(10);
	}

}
