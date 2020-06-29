package arrays;

import java.util.Arrays;

public class array_class {

    public static void main(String[] args) {

        double grades[] = new double[3];
        grades[0] = 8.0;
        grades[1] = 3.6;
        grades[2] = 8.9;

        System.out.println(grades[0]);
        System.out.println(grades[1]);
        System.out.println(grades[2]);
        System.out.println(grades);
        System.out.println(Arrays.toString(grades));

        double media = 0;

        for (int loop = 0; loop < 3; loop++){
            System.out.println(grades[loop]);
            media += grades[loop];
        }

        System.out.println("Media: "+media/3);
    }

}
