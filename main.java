import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner employee = new Scanner(System.in);
        
        System.out.print("Enter a value for conversion: ");
        double weight_value = employee.nextDouble();
        employee.nextLine(); // consume the newline

        String[] weight_unit = {"kg", "kilogram", "gram", "g", "pound", "lb", "ton", "tonne", "t"};
        Converter(weight_value, weight_unit);
        
        employee.close();
    }

    public static void Converter(double weight_value, String[] weight_unit) {
        Scanner employee = new Scanner(System.in);
        
        System.out.print("Enter a (valid) unit: ");
        String input_unit = employee.nextLine();
        boolean found = false;
        
        for (String test : weight_unit) {
            if (test.equals(input_unit)) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.print("Input a unit (till ton) you want to convert to: ");
            String input_unit_2 = employee.nextLine();

            double result = -1;
            if (input_unit.equals("kilogram") || input_unit.equals("kg")) {
                if (input_unit_2.equals("gram") || input_unit_2.equals("g")) {
                    result = weight_value * 1000;
                } else if (input_unit_2.equals("pound") || input_unit_2.equals("lb")) {
                    result = weight_value * 2.20462;
                } else if (input_unit_2.equals("ton") || input_unit_2.equals("tonne") || input_unit_2.equals("t")) {
                    result = weight_value / 1000;
                }
            } else if (input_unit.equals("gram") || input_unit.equals("g")) {
                if (input_unit_2.equals("kilogram") || input_unit_2.equals("kg")) {
                    result = weight_value / 1000;
                } else if (input_unit_2.equals("pound") || input_unit_2.equals("lb")) {
                    result = weight_value * 0.00220462;
                } else if (input_unit_2.equals("ton") || input_unit_2.equals("tonne") || input_unit_2.equals("t")) {
                    result = weight_value / 1_000_000;
                }
            } else if (input_unit.equals("pound") || input_unit.equals("lb")) {
                if (input_unit_2.equals("kilogram") || input_unit_2.equals("kg")) {
                    result = weight_value * 0.453592;
                } else if (input_unit_2.equals("gram") || input_unit_2.equals("g")) {
                    result = weight_value * 453.592;
                } else if (input_unit_2.equals("ton") || input_unit_2.equals("tonne") || input_unit_2.equals("t")) {
                    result = weight_value * 0.000453592;
                }
            } else if (input_unit.equals("ton") || input_unit.equals("tonne") || input_unit.equals("t")) {
                if (input_unit_2.equals("kilogram") || input_unit_2.equals("kg")) {
                    result = weight_value * 1000;
                } else if (input_unit_2.equals("gram") || input_unit_2.equals("g")) {
                    result = weight_value * 1_000_000;
                } else if (input_unit_2.equals("pound") || input_unit_2.equals("lb")) {
                    result = weight_value * 2204.62;
                }
            }
            
            if (result != -1) {
                System.out.println("The result in " + input_unit_2 + " is " + result);
            } else {
                System.out.println("Conversion from " + input_unit + " to " + input_unit_2 + " is not supported.");
            }
        } else {
            System.out.println("The following unit provided for conversion isn't supported.");
        }
        
        employee.close();
    }
}

