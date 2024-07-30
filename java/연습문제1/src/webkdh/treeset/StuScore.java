package webkdh.treeset;

import java.util.Objects;

public class StuScore implements Comparable<StuScore>{
	private String stuNum;
	private String name;
	private int score;

	public StuScore (String stuNum, String name, int score) {
		this.stuNum = stuNum;
		this.name = name;
		this.score = score;
	}

	public String getStuNum() {
		return stuNum;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(StuScore o) {
			return this.score < o.score  ? 1 : this.score == o.score ? 0 : -1; // 성적 오름차
//			return this.score < o.score  ? -1 : this.score == o.score ? 0 : 1; // 성적 내림차
		}

	@Override
	public boolean equals(Object obj) {
		StuScore temp = (StuScore) obj;
		if(stuNum.equals(temp.stuNum)) {
			return true;
		}
		return false;
		
	}
	
	@Override
	public int hashCode() {
		return stuNum.hashCode();
	}

	@Override
	public String toString() {
		return "학번 " + stuNum + ", 이름 " + name + ", 성적 " + score;
	} 
	}
	
