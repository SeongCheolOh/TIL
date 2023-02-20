package checkEx;

public class Ex10class2 implements Comparable<Ex10class2>{

	public String id;
	public int score;
	public Ex10class2(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}
	//코드 작성하기
	@Override
	public int compareTo(Ex10class2 o) {
/*		if(score < o.score) return -1;
		else if(score == o.score) return 0;
		else return 1; */
	return score - o.score;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
