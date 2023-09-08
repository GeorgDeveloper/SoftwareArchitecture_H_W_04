import java.util.Collection;
import java.util.Date;

public class Customer {
    /**
     * Покупатель
     */
    private static int counter = 0;

    private final int id;

    private Collection<Ticket> tickets;

    {
        id = ++counter;
    }

    public Collection<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(Collection<Ticket> tickets) {
        this.tickets = tickets;
    }

    public int getId() {
        return id;
    }


}
