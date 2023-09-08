import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Database {
    /**
     * База данных
     */

    private static int counter;
    private Collection<Ticket> tickets = new ArrayList<>();
    private Collection<Customer> customers = new ArrayList<>();

    public Database() {

        for (int i = 0; i < 9; i++) {
            Customer customer = new Customer();
            customers.add(customer);
            tickets.add(new Ticket(customer.getId(), new FormarDate(new Date()).getDate()));
        }
    }


    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public Collection<Customer> getCustomers() {
        return customers;
    }

    /**
     * Получить актуальную стоимость билета
     * @return
     */
    public double getTicketAmount(){
        return 45;
    }

    /**
     * Получить идентификатор заявки на покупку билета
     * @return
     */
    public int createTicketOrder(int clientId){
        return ++counter;
    }
}
