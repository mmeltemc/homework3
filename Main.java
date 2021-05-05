package homework3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstName("Müjgan Meltem Çaðla");
		student.setLastName("Çullu");
		student.seteMail("mujganmeltemcaglacullu@gmail.com");
		student.setPassword("123");
		student.setLessonLearned("Java");
		student.setInstructorName("Engin Demiroð");
		student.setPercentageOfCompletion(30);
		student.setId(1);
		System.out.println(student.getUserName());
		StudentManager studentManager = new StudentManager();
		
		
		
		Instructor instructor = new Instructor(1, "Engin", "Demiroð", "eng@gmail.com", "456", "Java", 3);
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.verilerYazýldý(instructor);
		instructorManager.update(instructor);
		
		studentManager.verilerYazýldý(student);
		studentManager.add(student);
	}

}
