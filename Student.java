package homework3;

public class Student extends User{
	
	String lessonLearned;
	double percentageOfCompletion;
	String instructorName;



	public Student(int id, String firstName, String lastName, String eMail, String password, String lessonLearned,
			double percentageOfCompletion, String instructorName) {
		super(id, firstName, lastName, eMail, password);
		this.lessonLearned = lessonLearned;
		this.percentageOfCompletion = percentageOfCompletion;
		this.instructorName = instructorName;
	}

	public Student(){
		
	}

	public String getLessonLearned() {
		return lessonLearned;
	}

	public void setLessonLearned(String lessonLearned) {
		this.lessonLearned = lessonLearned;
	}

	public double getPercentageOfCompletion() {
		return percentageOfCompletion;
	}

	public void setPercentageOfCompletion(double percentageOfCompletion) {
		this.percentageOfCompletion = percentageOfCompletion;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	

}
