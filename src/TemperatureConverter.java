import java.util.Scanner;

public class TemperatureConverter {

    // converts temperature between C and F
    public static double convertTemperature(double temperature, String unit) {

        if (unit.equalsIgnoreCase("C")) {
            return (temperature * 9.0 / 5.0) + 32;
        } else {
            return (temperature - 32) * 5.0 / 9.0;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.print("Enter a temperature or type stop: ");
            String tempInput = input.nextLine();

            if (tempInput.equalsIgnoreCase("stop")) {
                running = false;
            } else {

                boolean valid = true;

                for (int i = 0; i < tempInput.length(); i++) {
                    char c = tempInput.charAt(i);

                    if (!Character.isDigit(c) && c != '.' && c != '-') {
                        valid = false;
                    }
                }

                if (valid && tempInput.length() > 0) {

                    double temperature = Double.parseDouble(tempInput);

                    String unit = "";
                    boolean validUnit = false;

                    while (!validUnit) {

                        System.out.print("Enter unit (C or F): ");
                        unit = input.nextLine();

                        if (unit.equalsIgnoreCase("C") || unit.equalsIgnoreCase("F")) {
                            validUnit = true;
                        } else {
                            System.out.println("Invalid unit. Enter C or F.");
                        }
                    }

                    double result = convertTemperature(temperature, unit);

                    if (unit.equalsIgnoreCase("C")) {
                        System.out.printf("%.2f C is equal to %.2f F%n", temperature, result);
                    } else {
                        System.out.printf("%.2f F is equal to %.2f C%n", temperature, result);
                    }

                } else {
                    System.out.println("Invalid temperature.");
                }
            }
        }

        System.out.println("Goodbye!");
        input.close();
    }
}

