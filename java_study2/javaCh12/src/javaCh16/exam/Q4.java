package javaCh16.exam;

public class Q4 {
	
	public static void main(String[] args) {
		
		Thread thread = new Thread( new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0; i<3; i++) {
					System.out.println("�۾� �����尡 ����˴ϴ�.");
				}
			}
		});
		
		//���ٽ� ǥ��
		Thread thread1 = new Thread(()-> {
			for(int i = 0; i<3; i++) {
				System.out.println("�۾� �����尡 ����˴ϴ�.");
			}
		});
		thread1.start();
	}

}
