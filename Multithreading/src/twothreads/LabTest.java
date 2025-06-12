package twothreads;

public class LabTest {
	public static void main(String args[]) {
		Lab b=new Lab("plzz takee roll no");
		b.start();
		Lab b1=new Lab("roll no");
		b1.start();
		
	}
  
}
