package Ch16.Project_1;

import java.util.List;

public class Quiz {
	String quizname;
	int quizid;
	List Availablequizs;
	
	public void setQuizname(String quizname) {
		this.quizname = quizname;
	}
    public void setQuizid(int quizid) {
		this.quizid = quizid;
	}
	
	public void setAvailablequizs(List availablequizs) {
		Availablequizs = availablequizs;
	}
	@Override
	public String toString() {
		return "Quiz [quizname=" + quizname + ", quizid=" + quizid + ", AvailableQuizs=" + Availablequizs + "]";
	}
	
	
	
	

}
