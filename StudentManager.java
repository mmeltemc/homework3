package homework3;

public class StudentManager extends UserManager{
	public void add(User user) {
		System.out.println(user.getFirstName()+ user.getLastName()+ "\töðrencisi eklendi");
	}
	
	public void remove(User user) {
		System.out.println(user.getFirstName()+ user.getLastName()+ "\töðrencisi silinci");
	}
	public void update(User user) {
		System.out.println(user.getFirstName()+ user.getLastName()+ "\töðrencisi güncellendi");
	}
}
