public class BusStation {
    /**
     * Автобусная станция
     */

    private final TicketProvider ticketProvider;

    public BusStation(TicketProvider ticketProvider){
        this.ticketProvider = ticketProvider;
    }

    public boolean checkTicket(String qrCode , int customerId){
        return ticketProvider.checkTicket(qrCode, customerId);
    }
}
