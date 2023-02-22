package javaMid5.cafe1331;

public class SungJuk {

	private String subject; // 과목명
	private int score; //점수
	private int midExam; // 중간고사
	private int finExam; // 기말고사
	private int performEvalution; // 수행평가
	
	
	void printAll() {//성적출력 메소드
		
	}
	
	
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getMidExam() {
		return midExam;
	}
	public void setMidExam(int midExam) {
		this.midExam = midExam;
	}
	public int getFinExam() {
		return finExam;
	}
	public void setFinExam(int finExam) {
		this.finExam = finExam;
	}
	public int getPerformEvalution() {
		return performEvalution;
	}
	public void setPerformEvalution(int performEvalution) {
		this.performEvalution = performEvalution;
	}

}
