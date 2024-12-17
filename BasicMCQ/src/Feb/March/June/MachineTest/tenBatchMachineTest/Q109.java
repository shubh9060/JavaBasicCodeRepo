package Feb.March.June.MachineTest.tenBatchMachineTest;

class PrintNaturalNumber extends Thread{
	
	synchronized void printNaturalNumbers() throws InterruptedException {
		int i=1;
		while(i<=10) {
			//sleep(1000);
			System.out.println("Numbers :"+i);
			i++;
		}
	}
	public void run() {
		try {
			this.printNaturalNumbers();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
class PrintAlphabets extends Thread{
	
	synchronized void printAlphabets()throws InterruptedException {
		int i=65;
		while(i<=90) {
			//sleep(5000);
			System.out.printf("Alphabets :%c",i);
			i++;
		}
	}
	public void run() {
		try {
			this.printAlphabets();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
public class Q109 {

		public static void main(String[] args) {
			
			Thread t1 = new Thread(new PrintNaturalNumber());
			t1.start();
			
			Thread t2 = new Thread(new PrintAlphabets());
			t2.start();
		}
}
