import java.util.Date;
import java.text.SimpleDateFormat;

public class forDate {
    public static void main(String[] args) {
        Date newDate = new Date();  // extract the current date
        SimpleDateFormat changeDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  // assign which date you required
        // NOTE : month should be in capital like (MM) other wise compiler will be confused in minute and month 
        
        String formattedDate = changeDateFormat.format(newDate);  // change the date format assigned on the above type 
        System.out.println(formattedDate);
    }
}
