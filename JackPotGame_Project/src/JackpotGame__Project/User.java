package JackpotGame__Project;

public class User {
	private String Username;
	private String Password;
	
	public User(String Username,String Password) {
		super();
		this.Username=Username;
		this.Password=Password;
		
	}
public User() {
	
}
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	this.Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	this.Password = password;
}

}
