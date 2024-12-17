package Exception_Program;

import java.util.*;
import java.util.stream.Stream;

class User{
	int uid;
	String username,password;
	public User(int uid, String username, String password) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
	}
	public int getUid() {
		return uid;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + "]";
	}
	
}
public class Jdk8FilterApp {

		public static void main(String[] args) {
			
			User u1 = new User(201,"user1","112233");
			User u2 = new User(202, "user2", "558877");
			User u3 = new User(203,"user3","888332");
			User u4 = new User(204, "user4", "998822");
			
			ArrayList<User> alUser = new ArrayList<User>();
//			alUser.add(u1);
//			alUser.add(u2);
//			alUser.add(u3);
//			alUser.add(u4);
			Stream<User> u = Stream.of(u1,u2,u3,u4);
			u.filter((x) -> x.getUsername().equals("user2")).forEach(b->System.out.println(b));
		}
}
