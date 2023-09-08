import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Ticket {
    /**
     * Билет
     */

    private int id;

    private int customerId;

    private Date date;

    private String qrcode;

    private boolean enable = true;

    private static final AtomicInteger COUNTER = new AtomicInteger(1);

    SimpleDateFormat formatForDateNow = new SimpleDateFormat("yyyy.MM.dd");
    public Ticket( int customerId, Date date) {
        id = COUNTER.getAndIncrement();
        this.customerId = customerId;
        this.date = date;
        qrcode = "qrcode";

    }



    public Ticket() {
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public int getId() {
        return id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public Date getDate() {
        return date;
    }

    public String getQrcode() {
        return qrcode;
    }

    public boolean isEnable() {
        return enable;
    }

    @Override
    public String toString() {
        return "Билет " +
                "№ = " + id +
                ", Покупатель = " + customerId +
                ", Дата = " + date +
                ", qrcode = '" + qrcode + '\'' +
                ", Активация = " + enable;
    }
}
