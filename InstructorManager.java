package homework3;

public class InstructorManager extends UserManager{
	public void add(User user) {
		System.out.println(user.getFirstName()+ user.getLastName()+ "\te�itmeni eklendi");
	}
	
	public void remove(User user) {
		System.out.println(user.getFirstName()+ user.getLastName()+ "\t�itmeni silindi");
	}
	public void update(User user) {
		System.out.println(user.getFirstName()+ user.getLastName()+ "\te�itmeni g�ncellendi");
	}
	
	
}
