package JackpotGame__Project;

import java.util.ArrayList;

public class UserOp {
	private ArrayList<User>list;
		public UserOp() {
		list = new ArrayList<User>();
	}
public void addUser(User op) {
	list.add(op);
}
public void display() {
	for(User us:list) {
		System.out.println("Usename"+us.getUsername()+"Password"+us.getPassword());
	}
	}
	
public void getAuthentication(String Username,String Password) {
	boolean found;
for(User op:list) {
	String existingUsername=op.getUsername();
	String existingPassword=op.getPassword();
	
	if(existingUsername.equals(Username)&&existingPassword.equals(Password)) {
		System.out.println("Login Sucessfully!!!");
		found=true;
		while(found=true) {
		       JackpotResult.getJackpotInfo();
			}

		
	
	

break;
}else {
		System.out.println("Enter Correct Username or Password");
		break;
		
	}
}
}
}
