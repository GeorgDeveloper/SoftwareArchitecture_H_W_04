import java.util.Collection;
import java.util.Date;

public class Program {

    /**
     * Разработать контракты и компоненты системы "Покупка онлайн билетов на автобус в час пик".
     *
     * 1.  Предусловия.
     * 2.  Постусловия.
     * 3.  Инвариант.
     * 4.  Определить абстрактные и конкретные классы.
     * 5.  Определить интерфейсы.
     * 6.  Реализовать наследование.
     * 7.  Выявить компоненты.
     * 8.  Разработать Диаграмму компонент использую нотацию UML 2.0. Общая без деталей.
     */
    public static void main(String[] args) {


        Core core = new Core();
        //Логин задаем от 1 до 9
        MobileApp mobileApp = new MobileApp(core.getTicketProvider(), core.getCustomerProvider(), "5", "pass");
        BusStation busStation = new BusStation(core.getTicketProvider());


        if (mobileApp.buyTicket("11000000221")){
            System.out.format("Клиент %s успешно купил билет. \n", mobileApp.getCustomer().getId());
            System.out.format("Клиент купил билет %s. \n",mobileApp.searchTicket(new FormarDate(new Date()).getDate()));
            Collection<Ticket> tickets = mobileApp.searchTicket(new FormarDate(new Date()).getDate());
            if (busStation.checkTicket(tickets.stream().findAny().get().getQrcode(), tickets.stream().findAny().get().getCustomerId())){
                System.out.println("Клиент успешно прошел в автобус.");
                System.out.format("Билет клиента %s. \n",mobileApp.searchTicket(new FormarDate(new Date()).getDate()));
            }
        }


    }

}
