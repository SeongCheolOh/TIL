package javaMid7.p409;

import javax.swing.ButtonModel;

public class AnonymousEx {

	public static void main(String[] args) {
		// 익명중첩메소드
		
		Button btnOk = new Button();
		
		class OkListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Ok버튼을 클릭합니다");
				
			}
		}
		
		btnOk.setClickListener(new OkListener());
		btnOk.click();
		
		Button btnCc = new Button();
		
		class CancleListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Cancel버튼을 클릭합니다");
				
			}
		}
		btnCc.setClickListener(new CancleListener());
		btnCc.click();
	}

}
