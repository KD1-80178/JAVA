package Assignment_2_question_3;

public class TestDate {

	public static void main(String[] args) {
		Date d1=new Date();
		d1.display();
		
		Date d2=new Date(31,12,2000);
		d2.display();
		
		Date d3=new Date();
		d3.acceptDate();
		d3.display();

	}

}
