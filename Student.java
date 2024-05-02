package Ch16.Project_1;

public class Student {
	String name;
	int studentid;
	Quiz quiz;
	public Student(String name, int studentid, Quiz quiz) {
		super();
		this.name = name;
		this.studentid = studentid;
		this.quiz = quiz;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", studentid=" + studentid + ", quiz=" + quiz + "]";
	}
	

}
