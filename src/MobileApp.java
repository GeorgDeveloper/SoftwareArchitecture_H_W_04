import java.util.Collection;
import java.util.Date;

public class MobileApp {
    /**
     * Мобильное приложение
     */

    private final Customer customer;
    private final TicketProvider ticketProvider;
    private final CustomerProvider customerProvider;
    private boolean validUser = false;


    public MobileApp(TicketProvider ticketProvider, CustomerProvider customerProvider, String login, String pass) {
        this.ticketProvider = ticketProvider;
        this.customerProvider = customerProvider;
        validUser(login);
        if (validUser){
            customer = customerProvider.getCustomer(login, pass);
        } else {
            customer = new Customer();
        }
    }

    private void validUser(String login){
        if(Integer.parseInt(login) > 0 && Integer.parseInt(login) <= 9){
            validUser = true;
        } else {System.out.println("Пользователь не найден");}
    }
    public Collection<Ticket> getTickets(){
        return customer.getTickets();
    }

    public Collection<Ticket> searchTicket(Date date){
       return ticketProvider.searchTicket(customer.getId(), date);
    }

    public boolean buyTicket(String cardNo){
        if (validUser){
            return ticketProvider.buyTicket(customer.getId(), cardNo);
        } else {
            System.out.println("Покупка не возможна. Сначала зарегистрируйтесь");
            return false;
        }
    }

    public Customer getCustomer() {
        return customer;
    }
}
