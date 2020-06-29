package arrays;
import java.util.Arrays;

public class array_class {

    public static void main(String[] args) {

        double grades[] = new double[4];
        grades[0] = 8.0;
        grades[1] = 3.6;
        grades[2] = 8.9;
        grades[3] = 10.0;

        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);
        System.out.println(grades[3]);
        System.out.println(grades);
        System.out.println(Arrays.toString(grades));

        double media = 0;

        for (int loop = 0; loop < grades.length; loop++) {
            System.out.println(grades[loop]);
            media += grades[loop];
        }
        System.out.println("Media: " + media / grades.length);
        
        double grades2[] = {7.2, 5.3, 8.1};
        for (int i = 0; i < grades2.length; i++) {
            System.out.println(grades2[i]);
        }
    }
}
