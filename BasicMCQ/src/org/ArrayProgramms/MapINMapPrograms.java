package org.ArrayProgramms;
import java.util.*;
class Player {

	int pId;
	String name;
	int runs;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public Player(int pId, String name, int runs) {
		super();
		this.pId = pId;
		this.name = name;
		this.runs = runs;
	}

	@Override
	public String toString() {
		return "Player [pId=" + pId + ", name=" + name + ", runs=" + runs + "]";
	}

}

public class MapINMapPrograms {
	public static void main(String[] args) {

			Map<Integer,Player[]> map1 = new HashMap<Integer,Player[]>();// india
			//Map<Integer,Player[]> map2 = new HashMap<Integer,Player[]>();
			Map<String, Map<Integer, Player[]>> map3 = new HashMap<String,Map<Integer,Player[]>>();
			
			Player p1[]=new Player[2];
			p1[0] = new Player(101,"Virat Kohli",45000);
			p1[1] = new Player(102,"Rohit Sharama",35000);
			
			map1.put(1001,p1);
			map3.put("India",map1);
			Player p2[]=new Player[2];
			p2[0] = new Player(201,"A B Divilars",25000);
			p2[1] = new Player(202,"K Dekock ",45000);
			
			map1.put(1002,p2);
			map3.put("South Africa", map1);
			
			System.out.println("Data:"+map3);
			
	}

}
