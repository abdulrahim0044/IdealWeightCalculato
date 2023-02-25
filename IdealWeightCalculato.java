import java.util.Scanner;

public class IdealWeightCalculato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Ideal Weight Calculator");

        System.out.print("Please enter your gender (M/F): ");
        String gender = scanner.nextLine();

        System.out.print("Please enter your height in centimeters: ");
        double height = scanner.nextDouble() / 100.0; // تحويل الطول إلى المتر

        double idealWeight;
        if (gender.equalsIgnoreCase("M")) {
            idealWeight = (height * 100 - 100) * 0.9;
        } else {
            idealWeight = (height * 100 - 100) * 0.85;
        }

        System.out.println("Your ideal weight is: " + idealWeight + " kilograms.");
    }
}