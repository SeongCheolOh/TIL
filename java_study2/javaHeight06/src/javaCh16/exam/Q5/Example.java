package javaCh16.exam.Q5;

import javaCh16.exam.Q5.Button.ClickListener;

public class Example {

	public static void main(String[] args) {
		
		Button btnOk = new Button();
		btnOk.setClickListener(new ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Ok ��ư�� Ŭ���޽��ϴ�");
				
			}
		});
		btnOk.click();
		
		Button btnCancle = new Button();
		btnCancle.setClickListener(()->//���⿡ ���ٽ� �ۼ�
			System.out.println("Cancel ��ư�� Ŭ���߽��ϴ�")
		);
		btnCancle.click();
		
	}

}
