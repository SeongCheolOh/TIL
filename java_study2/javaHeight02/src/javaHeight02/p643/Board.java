package javaHeight02.p643;

public class Board {

	private String subject; // �Խ��� ����
	private String content; // �Խ��� ����
	private String writer; // �Խ��� �۾���
	private String joindate; // �ۼ���
	
	public Board(String subject, String content, String writer, String joindate) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
		this.joindate = joindate;
	}
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	
	
}
