import java.util.Scanner;

public class TemperatureConverter {

    // Converts Celsius to Fahrenheit  to Celsius
    public static double convertTemperature(double temperature, String unit) {

        if (unit.equalsIgnoreCase("C")) {
            return (temperature * 9.0 / 5.0) + 32;
        } else {
            return (temperature - 32) * 5.0 / 9.0;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean done = false;

        // Keep running until users stop the program
        while (!done) {

            System.out.print("Enter a temperature or type stop: ");
            String tempInput = input.nextLine();

            // Exiting the program
            if (tempInput.equalsIgnoreCase("stop")) {
                done = true;
            } else {

                boolean valid = true;

                // Check if the temperature input is valid in the code
                for (int i = 0; i < tempInput.length(); i++) {

                    char ch = tempInput.charAt(i);

                    if (!Character.isDigit(ch) && ch != '.' && ch != '-') {
                        valid = false;
                    }
                }

                if (valid && tempInput.length() > 0) {

                    double temperature = Double.parseDouble(tempInput);

                    System.out.print("Enter unit (C or F): ");
                    String unit = input.nextLine();

                    // Check if unit is C or F
                    if (unit.equalsIgnoreCase("C")
                            || unit.equalsIgnoreCase("F")) {

                        double answer =
                                convertTemperature(temperature, unit);

                        // The conversion result
                        if (unit.equalsIgnoreCase("C")) {
                            System.out.printf("%.2f°C is equal to %.2f°F%n",
                                    temperature, answer);
                        } else {
                            System.out.printf("%.2f°F is equal to %.2f°C%n",
                                    temperature, answer);
                        }

                    } else {
                        System.out.println("Invalid unit. Enter C or F.");
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
