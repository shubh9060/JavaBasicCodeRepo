package JuneAssignmentPrograms100Programs;
class QQ{
	int len,bre;
	QQ(){
		len=0;
		bre=0;
		System.out.println("i am Default Contructor");
		System.out.println("Result:"+(len*bre));
	}
	QQ(int value)
	{
		System.out.println("i am Single Parametrized Contructor");
		System.out.println("Result:"+(value*value));
	}
	QQ(int len,int bre)
	{
		this.len=len;
		this.bre=bre;
		System.out.println("i am Two Parametrized Contructor");
		System.out.println("Result:"+(len*bre));
	}
	
}
public class Q1 {

		public static void main(String[] args) {
			
			QQ q1 = new QQ();
			QQ q2 = new QQ(5);
			QQ q3 = new QQ(5, 3);
			
		}
		
}
