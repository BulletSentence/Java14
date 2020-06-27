package date_class;

public class Date_main {
    public static void main(String[] args) {

        Date_class data = new Date_class();

        data.day = "28";
        data.month = "10";
        data.year = "1998";

        System.out.println("BDay: " + data.getFormattedData());

    }
}
