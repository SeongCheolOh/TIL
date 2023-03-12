package javaCh16.exam.Q5;

import javaCh16.exam.Q5.Button.ClickListener;

public class Example {

	public static void main(String[] args) {
		
		Button btnOk = new Button();
		btnOk.setClickListener(new ClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭햇습니다");
				
			}
		});
		btnOk.click();
		
		Button btnCancle = new Button();
		btnCancle.setClickListener(()->//여기에 람다식 작성
			System.out.println("Cancel 버튼을 클릭했습니다")
		);
		btnCancle.click();
		
	}

}
