package homework3;

public class InstructorManager extends UserManager{
	public void add(User user) {
		System.out.println(user.getFirstName()+ user.getLastName()+ "\teðitmeni eklendi");
	}
	
	public void remove(User user) {
		System.out.println(user.getFirstName()+ user.getLastName()+ "\tðitmeni silindi");
	}
	public void update(User user) {
		System.out.println(user.getFirstName()+ user.getLastName()+ "\teðitmeni güncellendi");
	}
	
	
}
