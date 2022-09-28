import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customers = new ArrayList<Customer>();
		
		customers.add(new Customer(1, "Evren", "Akgun"));
		customers.add(new Customer(2, "Nida", "Akgun"));
		customers.add(new Customer(3, "Eda", "Akgun"));
		
		
		
		for (Customer customer : customers) {
			System.out.println(customer.firstName);
		}
	}

}
