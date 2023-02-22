package javaMid5.cafe1331;

public class EliStudent extends SungJuk{
	@Override
	public String toString() {
		return "초등학생";
	}

	@Override
	void printAll() {
		System.out.println("------------------");
		System.out.println("초등학교 성적입니다");
		System.out.println("------------------");
		System.out.println("과목명 : "+ getSubject());
		System.out.println("시험 : " + getMidExam() + ", 기말고사 : " + getFinExam() + ", 수행평가 : " + getPerformEvalution());
		System.out.println("점수 : " + getScore());
	}

	
}
