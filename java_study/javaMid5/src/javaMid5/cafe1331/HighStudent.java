package javaMid5.cafe1331;

public class HighStudent extends MidStudent{
	
	private double standardDeviation; // 표준편차
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "고등학생";
	}
	
	@Override
	void printAll() {
		System.out.println("------------------");
		System.out.println(" 성적입니다");
		System.out.println("------------------");
		System.out.println("과목명 : "+ getSubject());
		System.out.println("시험 : " + getMidExam() + ", 기말고사 : " + getFinExam() + ", 수행평가 : " + getPerformEvalution() + ", 교사명 : " + getTeacher() + ", 출석점수 : " + getDayCheck() + ", 봉사점수 " + getService() + "표준편차 : " + getStandardDeviation());
		System.out.println("점수 : " + getScore());
		System.out.println("표준편차 : " + getStandardDeviation());
	}
	
	public double getStandardDeviation() {
		return standardDeviation;
	}

	public void setStandardDeviation(double standardDeviation) {
		this.standardDeviation = standardDeviation;
	}
	
}
