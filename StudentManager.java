package homework3;

public class StudentManager extends UserManager{
	public void add(User user) {
		System.out.println(user.getFirstName()+ user.getLastName()+ "\t��rencisi eklendi");
	}
	
	public void remove(User user) {
		System.out.println(user.getFirstName()+ user.getLastName()+ "\t��rencisi silinci");
	}
	public void update(User user) {
		System.out.println(user.getFirstName()+ user.getLastName()+ "\t��rencisi g�ncellendi");
	}
}
