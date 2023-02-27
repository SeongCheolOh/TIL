package javaCh12.ex09;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class IntegerCompareEx {

	public static void main(String[] args) {
		// Ȯ�ι��� 12��
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);//true
		System.out.println(obj3.equals(obj4));//false
		//�� false?? >> -128 ~ 127������ ������ ��
		// �� ���� �̿ܿ��� ������ ��
		//���� ���� �� �ֵ��� �ڵ� �����ϱ�
		
		// Ȯ�ι��� 13��
		System.out.println(Math.ceil(5.3));
		System.out.println(Math.floor(5.3));
		System.out.println(Math.max(5.3, 2.5));
		System.out.println(Math.round(5.7)); //6.0�� �ƴ� 6
		
		// Ȯ�ι��� 15��
		// SimpleDateFormat ����� ���� ���ϱ��� ���� ���Ҵ��� ��� 
		//1. ���� ��¥ ���ϱ� / 2. 2023 12 31 ��¥���� / 3. until( , );
		LocalDateTime today = LocalDateTime.now();
		LocalDateTime lastDay = LocalDateTime.of(2023, 12, 31, 23, 59);
		System.out.println(today);
		System.out.println(lastDay);
		long remainDay = today.until(lastDay, ChronoUnit.DAYS);
		System.out.println(remainDay);
		
		// Ȯ�ι��� 16��
		// ���縦 xxxx�� xx�� xx�� x���� xx�� xx�� ���·� ���
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm��");
//		String a = sdf.format(date);
		System.out.println(sdf.format(date));

	}

}
