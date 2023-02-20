package FIFO;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {

	public static void main(String[] args) {
		Queue<Message> m1 = new LinkedList<Message>();

		m1.offer(new Message("sendMail", "홍길동"));
		m1.offer(new Message("sendMessage", "신용권"));
		m1.offer(new Message("sendkakaoTalk", "김자바"));
		m1.offer(new Message("sendFacebookMessage", "이경수"));
		
		while(!m1.isEmpty()) {
			Message m = m1.poll();
			System.out.println(m.getCommand().substring(4) + " " + m.getTo());
//			System.out.println(m1.poll().getCommand() +" "+ m1.poll().getTo()); 
			//앞 뒤가 각각으로 인식되어 4번(2줄만 출력된다)
			
		}
		
	}

}
