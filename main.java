import java.util.Scanner;

public class main {
		public static void main(String[] args){

			Scanner employee = new Scanner(System.in);

	    	System.out.print ("Enter a value for conversion: ");
			double weight_value = employee.nextDouble();
			String[] weight_unit = {"kg" , "kilogram", "gram", "g", "pound", "lb", "ton", "tonne", "t"};
			Converter(weight_unit);
  			employee.close();
		}
		public static void Converter (String[] weight_unit) {

		Scanner employee = new Scanner(System.in);

		System.out.print ("Enter a (valid) unit: ");
                String input_unit = employee.nextLine();
		boolean found = false;
		for (String test : weight_unit) {
		if (test.equals(input_unit)) {
			found = true;
			break;
		}
  		}

		if (found){
			System.out.print("Input a unit(till ton) you want to convert to: ");
			String input_unit_2 = employee.nextLine();
			    
				if(input_unit_2.equals("kg" or "kilogram")){
                     
				}
		}else {
	        	System.out.println("The following in input(unit) isnt from list");
		}
		employee.close();
		}
}
