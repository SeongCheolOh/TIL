package javaMid5.cafe1331;

public class MidStudent extends SungJuk{

	private String teacher; // 담당교사
	private int dayCheck; //출석점수
	private int service; //봉사점수
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "중학생";
	}
	
	@Override
	void printAll() {
		System.out.println("------------------");
		System.out.println("중학교 성적입니다");
		System.out.println("------------------");
		System.out.println("과목명 : "+ getSubject());
		System.out.println("시험 : " + getMidExam() + ", 기말고사 : " + getFinExam() + ", 수행평가 : " + getPerformEvalution() + ", 교사명 : " + getTeacher() + ", 출석점수 : " + getDayCheck() + ", 봉사점수 " + getService());
		System.out.println("점수 : " + getScore());
	}
	
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	public int getDayCheck() {
		return dayCheck;
	}
	public void setDayCheck(int dayCheck) {
		this.dayCheck = dayCheck;
	}
	public int getService() {
		return service;
	}
	public void setService(int service) {
		this.service = service;
	}
	
	
}
