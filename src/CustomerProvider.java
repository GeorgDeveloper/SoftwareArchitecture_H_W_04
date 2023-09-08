import java.util.ArrayList;
import java.util.Arrays;

public class CustomerProvider {
    private Database database;
    private Customer customer;

    public CustomerProvider(Database database) {
        this.database = database;
    }

    public Customer getCustomer(String login, String password){
        ArrayList<Customer> customers = (ArrayList<Customer>) database.getCustomers();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == Integer.parseInt(login)){
                customer = customers.get(i);
            }

        }
        customer.setTickets(database.getTickets());
        return customer;
    }
}
