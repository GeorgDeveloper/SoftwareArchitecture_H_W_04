import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormarDate {
    private Date date;

    private SimpleDateFormat formatForDateNow;

    public FormarDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        formatForDateNow = new SimpleDateFormat("yyyy.MM.dd");
        try {
            this.date = formatForDateNow.parse(formatForDateNow.format(date));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        };
        return date;
    }
}
