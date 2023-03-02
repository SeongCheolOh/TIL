package javaCh14.p600;

public class ThreadNameEx01 {

	public static void main(String[] args) {
		//p.600 ������ �̸�
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
		
		//ph�� �������̸� �˱�
		System.out.println(t1.currentThread().getName());
		System.out.println(t2.currentThread().getName());
//		System.out.println(yt.currentThread().getName());
		
		t1.currentThread().setName("��ȭ�ɱ�1");
		t2.currentThread().setName("��Ʃ�꺸��1");
		
		System.out.println(t1.currentThread().getName());
		System.out.println(t2.currentThread().getName());
		
		System.out.println(t1.currentThread().getPriority());
		
		//�켱���� 1~10���� 1�� ���� ������ ó��, 10�̸� ���� ������ ó���ϴ� ��
		t1.currentThread().setPriority(1);
		t2.currentThread().setPriority(10);
	}

}
