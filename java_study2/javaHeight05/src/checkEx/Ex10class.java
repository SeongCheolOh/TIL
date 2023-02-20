package checkEx;

public class Ex10class implements Comparable<Ex10class>{

	public String id;
	public int score;
	public Ex10class(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}
	//코드 작성하기
	@Override
	public int compareTo(Ex10class o) {
/*		if(score < o.score) return -1;
		else if(score == o.score) return 0;
		else return 1; */
	return score - o.score;
	}
	
}
