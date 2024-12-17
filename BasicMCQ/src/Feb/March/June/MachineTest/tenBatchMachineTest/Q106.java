package Feb.March.June.MachineTest.tenBatchMachineTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 Write a program to create class AccountInfo with username,password and accountType and
 perform serialization and deserialization on it.
 * 
 * 
 */

class AccountInformation implements Serializable{
	
	private int id;
	String userName,passWord;
	AccountInformation(int id,String userName,String passWord){
		this.id=id;
		this.userName=userName;
		this.passWord=passWord;
	}
	int getId() {
		return id;
	}
	String getUserName() {
		return userName;
	}
	String getPassWrod() {
		return passWord;
	}
	@Override
	public String toString() {
		return "AccountInformation [Id="+id+",userName="+userName+",passWord="+passWord+"]";
	}
}
public class Q106 {

		public static void main(String[] args) {
			
			try {
				
				// Here we Create Object of thoes class Which is Serialize now this Object is Name as AccountInformation Class
				
				AccountInformation acObject1 = new AccountInformation(201,"admin@123","admin@!123");
				
				// Here we Perform Serialization Concept on Object 
				
				FileOutputStream fos = new FileOutputStream("D:\\ReadFile_Folder\\accountDetails.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				System.out.println("=============================Serialized Object=====================================");
				// now we Serialized the object with help of ObjectOutputStream class method name is writeObject(Object obj);
				oos.writeObject(acObject1);
				
				FileInputStream fis = new FileInputStream("D:\\ReadFile_Folder\\accountDetails.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				
				// now we Deserialized the object with help of ObjectInputStream class method name is readObject(); 
				// this method are return the object of which is Serialized the object i.e AccountInformation class
				
				AccountInformation acObject2 = (AccountInformation)ois.readObject();
				
				System.out.println("=============================Deserialized Object=====================================");
				System.out.println("Id:"+acObject2.getId());
				System.out.println("UserName:"+acObject2.getUserName());
				System.out.println("Password:"+acObject2.getPassWrod());
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("File Not Found When we Perform Serialization and Deserialization Concept:"+e);
			}
			
			
			
		}
}
