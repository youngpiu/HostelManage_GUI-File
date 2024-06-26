package util;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.LocalDate;
import java.util.Locale;

public class FormatterUtil {

    public static String formatPrice(double price) {
        return String.format("%,.0f", price);
    }

    public static String formatPriceTable(double number) {
        NumberFormat formatter = NumberFormat.getNumberInstance(Locale.US);
        return formatter.format(number);
    }

    public static double strToDouble(String priceString) throws NumberFormatException {
        String cleanedPriceString = priceString.replace(",", "");
        double price;
        price = Double.parseDouble(cleanedPriceString);
        return price;
    }

    public static String localDateToStr(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }

    public static String formatLocalDate(LocalDate localDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return localDate.format(formatter);
    }

    public static Date parseDate(String dateString) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.parse(dateString);
    }

    public static String formatPhoneNumber(String phoneNumber) {
        return String.format("%s-%s-%s",
                phoneNumber.substring(0, 4),
                phoneNumber.substring(4, 7),
                phoneNumber.substring(7));
    }

    public static String parsePhoneNumber(String formattedPhoneNumber) {
        String phoneNumber = formattedPhoneNumber.replaceAll("[^0-9]", "");
        return phoneNumber;
    }

}
