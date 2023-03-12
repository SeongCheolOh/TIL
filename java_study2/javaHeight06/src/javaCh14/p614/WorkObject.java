package javaCh14.p614;

public class WorkObject {
	//p.614 wait() + notify()�� �̿��� ������ ����
	
	public synchronized void methodA() {
		System.out.println("ThreadA methodA() �۾� ����");
		notify(); //�����ϱ�
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB methodB() �۾� ����");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
