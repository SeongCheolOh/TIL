package javaHeight02.p643;

import java.util.ArrayList;
import java.util.List;

public class BoardEx03 {

	public static void main(String[] args) {
		
		List<Board> boardList1 = new ArrayList<Board>();
		
		boardList1.add(new Board("����", "�񰡿Ϳ�", "ȫ�浿","0210"));
		boardList1.add(new Board("����", "�ݿ���", "��浿","0211"));
		boardList1.add(new Board("�ָ�", "������Ʈ�ؿ�", "�̱浿","0212"));
		
		for(int i = 0; i<boardList1.size(); i++) {
			System.out.println(boardList1.get(i).getSubject());
		}
		
		//�Խ��� ���� "����"�̶�� ���� �� ����� �̸��� �ۼ����� �˻��ϼ���
		//����� >> ��浿 0221
		for(int i = 0; i < boardList1.size(); i++) {
			if(boardList1.get(i).getSubject().equals("����")) {
				System.out.println(boardList1.get(i).getWriter());
				System.out.println(boardList1.get(i).getJoindate());
			}
		}
		System.out.println("--------------");
		
		//�ۼ����� "0210"���� �Խñ��� ����� ������ ����ϼ���
		for(int i = 0; i < boardList1.size(); i++) {
			if(boardList1.get(i).getJoindate().equals("0210")) {
				System.out.println(boardList1.get(i).getSubject());
				System.out.println(boardList1.get(i).getContent());
			}
		}
		
	}

}
