import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DatePackage {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.getDayOfMonth());
        System.out.println(today.getMonthValue());
        System.out.println(today.getYear());
        System.out.println(today.atTime(7, 31));
        System.out.println(today.format(DateTimeFormatter.ISO_DATE));
        System.out.println(today.format(DateTimeFormatter.ISO_ORDINAL_DATE));
        System.out.println(today.format(DateTimeFormatter.ISO_WEEK_DATE));
    }
}
