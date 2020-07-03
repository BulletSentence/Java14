package arrays;

import java.util.Scanner;

public class matriz_class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantity?");
        int quantity = input.nextInt();

        System.out.println("Grades Quantity?");
        int grades = input.nextInt();

        double [][] all_grades = new double[quantity][grades];
        double total = 0;

        for (int i = 0; i < quantity; i++){
            for (int j = 0; j < grades; j++){

                System.out.printf("Grade number %d from student %d", j+1, i+1);
                all_grades[i][j] = input.nextDouble();
                total += all_grades[i][j];
            }
        }

        double media = total / (quantity * grades);
        System.out.println("Media: "+ media);

        input.close();
    }
}
