package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner key = new Scanner(System.in);

        System.out.print("How many people will be entered? ");
        int n = key.nextInt();

        double[] height = new double[n];
        char[] gender = new char[n];

        double shorterHeight = 0.0;
        double greatestHeight = 0.0;
        double averageHeightWomen = 0.0;


        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + "# Height person: ");
            height[i] = key.nextDouble();

            System.out.print((i + 1) + "# person gender: ");
            gender[i] = key.next().charAt(0);
        }

        greatestHeight = height[0];
        shorterHeight = height[0];
        int amountMen = 0;
        int amountWomen = 0;

        for (int i = 0; i < n; i++){

            if(height[i] > greatestHeight){
                greatestHeight = height[i];
            }
            if(height[i] < shorterHeight){
                shorterHeight = height[i];
            }
            if(gender[i] == 'M'){
                amountMen++;
            }else{
                averageHeightWomen += height[i];
                amountWomen++;
            }

        }

        System.out.println();
        System.out.println("Shorter Height = " + String.format("%.2f", shorterHeight));
        System.out.println("Greatest Height = " + String.format("%.2f", greatestHeight));
        System.out.println("Average Height of Women = " + String.format("%.2f", averageHeightWomen/amountWomen));
        System.out.println("Number of Men = " + amountMen);

    }
}
