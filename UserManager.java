package homework3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName()+ user.getLastName()+ "eklendi");
	}
	
	public void remove(User user) {
		System.out.println(user.getFirstName()+ user.getLastName()+ "eklendi");
	}
	public void update(User user) {
		System.out.println(user.getFirstName()+ user.getLastName()+ "eklendi");
	}
	
	public void verilerYazýldý(User user){
		System.out.println("\nKullanýcý bilgileri");
		System.out.println("id \t First Name \t Last Name \t E-mail" );
		System.out.println(user.getId()+"\t"+ user.getFirstName()+"\t\t"+ user.getLastName()+"\t\t"+ user.geteMail());
		
	}
}
