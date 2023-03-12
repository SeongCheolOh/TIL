package javaCh12.ex05;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class LocalDateTimeClass {

	public static void main(String[] args) {
		//p.537
		//������ - ���ó�¥ �ݳ��� 2�� ��
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		System.out.println("������ = " + now.format(dtf));
		
		LocalDateTime returnDate = now.plusWeeks(2);//2�� ��
		System.out.println("�ݳ��� = " + returnDate.format(dtf));

		//�޿��� ���ú��� 20�� �Ŀ�
		LocalDateTime getMoney = now.plusDays(20);
		System.out.println("���� ������ = " + getMoney.format(dtf));
		
		//�˶� - 5�ð�10�� �� �˶� �︮��
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH�� mm��");
		LocalDateTime alarmH = now.plusHours(5);
		LocalDateTime alarmM = alarmH.plusMinutes(10);
		System.out.println(alarmM.format(dtf1)+"�� �˶��� �︳�ϴ�");
		
		//�̷� ���� �ڻ� ����
		LocalDateTime myBank = now.plusYears(12);
		System.out.println("100�� ���ڰ� �Ǵ� �ش� " + myBank.format(dtf));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime sdt = LocalDateTime.of(2023,2,23,9,37,20);
		System.out.println("������ = " + sdt.format(dtf2));
		
		LocalDateTime edt = LocalDateTime.of(2023,12,31,23,59,59);
		System.out.println("������ = " + edt.format(dtf2));
		System.out.println("---------------");
		// ���ϱⰣ : 23.03.01 00:00:00 ~ 23.04.30 23:59:59
		// ��¥1 : 23.03.15 "���ϱⰣ" �̶�� ����ϱ�
		// ��¥2 : 23.02.20 "���ϱⰣ ��"
		// ��¥3 : 23.05.03 "������ �������ϴ�"
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("MM�� dd��");
		LocalDateTime startSail = LocalDateTime.of(2023, 03, 01, 00, 00, 00);
		LocalDateTime endSail = LocalDateTime.of(2023, 04, 30, 23, 59, 59);
		System.out.println("���ϱⰣ : " + startSail.format(dtf3)+ " ~ "+ endSail.format(dtf3));
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�� �Է��ϼ��� > ");
		int year = sc.nextInt();
		System.out.print("���� �Է��ϼ��� > ");
		int month = sc.nextInt();
		System.out.print("���� �Է��ϼ��� > ");
		int day = sc.nextInt();
		LocalDateTime a = LocalDateTime.of(year, month, day, 00, 00);
//		LocalDateTime b = LocalDateTime.of(23, 02, 20, 00, 00);
//		LocalDateTime c = LocalDateTime.of(23, 05, 03, 00, 00);
		if(a.isAfter(startSail) && a.isBefore(endSail)) {
			System.out.println(a.format(dtf4)+"�� ���ϱⰣ �Դϴ�");
		}else if(a.isBefore(startSail)) {
			System.out.println(a.format(dtf4)+"�� ���ϱⰣ �� �Դϴ�");
		}else if(a.isAfter(endSail)) {
			System.out.println(a.format(dtf4)+"�� ������ ���� �� �Դϴ�");
		}
/*		if(b.isAfter(startSail) && b.isBefore(endSail)) {
			System.out.println(b.format(dtf4)+"�� ���ϱⰣ �Դϴ�");
		}else if(b.isBefore(startSail)) {
			System.out.println(b.format(dtf4)+"�� ���ϱⰣ �� �Դϴ�");
		}else if(b.isAfter(endSail)) {
			System.out.println(b.format(dtf4)+"�� ������ ���� �� �Դϴ�");
		}
		if(c.isAfter(startSail) && c.isBefore(endSail)) {
			System.out.println(c.format(dtf4)+"�� ���ϱⰣ �Դϴ�");
		}else if(c.isBefore(startSail)) {
			System.out.println(c.format(dtf4)+"�� ���ϱⰣ �� �Դϴ�");
		}else if(c.isAfter(endSail)) {
			System.out.println(c.format(dtf4)+"�� ������ ���� �� �Դϴ�");
		} */
	}

}
