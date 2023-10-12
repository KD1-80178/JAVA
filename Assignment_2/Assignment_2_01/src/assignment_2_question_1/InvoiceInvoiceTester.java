package assignment_2_question_1;

public class InvoiceInvoiceTester {

	public static void main(String[] args) {
		Invoice i1=new Invoice("C01","calci",5,50);
		i1.calculateInvoiceAmount();
		
		Invoice i2=new Invoice();
		i2.acceptData();
		i2.display();
		i2.calculateInvoiceAmount();

	}

}
