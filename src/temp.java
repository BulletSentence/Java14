import java.text.DecimalFormat;

public class temp {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.00");

        final double FACTOR = 5.0 / 9.0;
        double f_value = 100;

        double celcius = (f_value - 32) * FACTOR;
        final String format = df.format(celcius);
        System.out.println(format + " ºC");
    }

}
