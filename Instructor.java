package homework3;

public class Instructor extends User{
	
	private String lectureGiven;
	private int numberOfLesson;
	
	

	public Instructor(int id, String firstName, String lastName, String eMail, String password, String lectureGiven,
			int numberOfLesson) {
		super(id, firstName, lastName, eMail, password);
		this.lectureGiven = lectureGiven;
		this.numberOfLesson = numberOfLesson;
	}

	public Instructor() {
		
		
	}

	public String getLectureGiven() {
		return lectureGiven;
	}

	public void setLectureGiven(String lectureGiven) {
		this.lectureGiven = lectureGiven;
	}

	public int getNumberOfLesson() {
		return numberOfLesson;
	}

	public void setNumberOfLesson(int numberOfLesson) {
		this.numberOfLesson = numberOfLesson;
	}


	
	
	
	
	
	
	
	
	
}
