
public class NeedForOverriding {

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		customer.setCustomerId(10415);
		customer.setCustomerName("Chris");
		
		System.out.println(customer.getCustomerId()+" | " + customer.getCustomerName());
		
		System.out.println(customer); //toString()
	}

}
