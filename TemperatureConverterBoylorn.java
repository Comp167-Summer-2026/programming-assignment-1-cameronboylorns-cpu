import java.util.Scanner;

public class TemperatureConverter
    {

    public static double convertTemperature(double temperature, String unit) {

        if (unit.equalsIgnoreCase("C")) {
            return (temperature * 9 / 5) + 32;
        } else {
            return (temperature - 32) * 5 / 9;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean done = false;

        while (!done) {

            System.out.print("Enter a temperature or type stop: ");
            String tempInput = input.nextLine();

            if (tempInput.equalsIgnoreCase("stop")) {
                done = true;
            } else {

                boolean valid = true;

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

                    if (unit.equalsIgnoreCase("C") ||
                            unit.equalsIgnoreCase("F")) {

                        double answer =
                                convertTemperature(temperature, unit);

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
