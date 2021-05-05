package homework3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstName("Mujgan Meltem Cagla");
		student.setLastName("Cullu");
		student.seteMail("mujganmeltemcaglacullu@gmail.com");
		student.setPassword("123");
		student.setLessonLearned("Java");
		student.setInstructorName("Engin Demirog");
		student.setPercentageOfCompletion(30);
		student.setId(1);
		System.out.println("Kullanıcı adı '"+ student.getUserName() + "' olarak sistem tarafından tanımlandı");
		StudentManager studentManager = new StudentManager();
		
		
		
		Instructor instructor = new Instructor(1, "Engin", "Demiroğ", "eng@gmail.com", "456", "Java", 3);
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.verilerYazıldı(instructor);
		instructorManager.update(instructor);
		
		studentManager.verilerYazıldı(student);
		studentManager.add(student);
	}

}
