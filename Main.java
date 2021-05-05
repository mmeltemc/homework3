package homework3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstName("M�jgan Meltem �a�la");
		student.setLastName("�ullu");
		student.seteMail("mujganmeltemcaglacullu@gmail.com");
		student.setPassword("123");
		student.setLessonLearned("Java");
		student.setInstructorName("Engin Demiro�");
		student.setPercentageOfCompletion(30);
		student.setId(1);
		System.out.println(student.getUserName());
		StudentManager studentManager = new StudentManager();
		
		
		
		Instructor instructor = new Instructor(1, "Engin", "Demiro�", "eng@gmail.com", "456", "Java", 3);
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.verilerYaz�ld�(instructor);
		instructorManager.update(instructor);
		
		studentManager.verilerYaz�ld�(student);
		studentManager.add(student);
	}

}