package FIFO;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx01 {

	public static void main(String[] args) {
		Queue<Message> m1 = new LinkedList<Message>();

		m1.offer(new Message("sendMail", "ȫ�浿"));
		m1.offer(new Message("sendMessage", "�ſ��"));
		m1.offer(new Message("sendkakaoTalk", "���ڹ�"));
		m1.offer(new Message("sendFacebookMessage", "�̰��"));
		
		while(!m1.isEmpty()) {
			Message m = m1.poll();
			System.out.println(m.getCommand().substring(4) + " " + m.getTo());
//			System.out.println(m1.poll().getCommand() +" "+ m1.poll().getTo()); 
			//�� �ڰ� �������� �νĵǾ� 4��(2�ٸ� ��µȴ�)
			
		}
		
	}

}
