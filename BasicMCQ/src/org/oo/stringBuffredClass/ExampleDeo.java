package org.oo.stringBuffredClass;

import java.util.*;
import java.io.*;

// adding array of object in file and reading array of object from file
class Emp implements Serializable {
	private int id;
	private String name;
	private int sal;

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSal() {
		return sal;
	}

}

public class ExampleDeo {
	public static void main(String args[]) throws Exception {

		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter employees id/name/sal");

			FileOutputStream f = new FileOutputStream("C:\\Users\\91808\\Desktop\\fFFFF\\result.txt", true);
			ObjectOutputStream out = new ObjectOutputStream(f);
			// out.writeObject(e);

			Emp e[] = new Emp[2];
			for (int i = 0; i < e.length; i++) {
				e[i] = new Emp();
				e[i].setId(sc.nextInt());
				e[i].setName(sc.next());
				e[i].setSal(sc.nextInt());
				// out.writeObject(e[i]);
			}
			out.writeObject(e);
			out.close();
			f.close();

			System.out.println("Following is reading object from file");
			FileInputStream fr = new FileInputStream("C:\\Users\\91808\\Desktop\\fFFFF\\result.txt");

			ObjectInputStream fin = new ObjectInputStream(fr);

			Emp err[] = (Emp[]) fin.readObject();
			System.out.println(err.length);
			for (int i = 0; i < err.length; i++)
				System.out.println(err[i].getId() + "\t" + err[i].getName() + "\t" + err[i].getSal());

			/*
			 * try{ Emp err=null; while((err =(Emp)fin.readObject())!=null){
			 * System.out.println(err.getId()+"\t"+err.getName()+"\t"+err.getSal()); }
			 * fin.close(); fr.close(); } catch(Exception ex){
			 * System.out.println("Error :"+ex); }
			 */

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("When we read or write files :" + e);
		}
	}
}
