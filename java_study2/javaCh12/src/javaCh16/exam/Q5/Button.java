package javaCh16.exam.Q5;

public class Button {

	public static interface ClickListener{
		void onClick();
	}
	
	private ClickListener clickListener;

	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}

	public void click() {
		this.clickListener.onClick();
	}
	
}
