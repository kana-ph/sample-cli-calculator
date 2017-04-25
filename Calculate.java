public class Calculate {
	public static void main(String[] args) {
		String method = args[0];
		String result = "";

		switch(method) {
			case "add":
				result = add(args[1], args[2]);
				break;
                        case "subtract":
                                result = subtract(args[1], args[2]);
                                break;
                        case "multiply":
                                result = multiply(args[1], args[2]);
                                break;
                        case "divide":
                                result = divide(args[1], args[2]);
                                break;
                        case "mod":
                                result = mod(args[1], args[2]);
                                break;

		}
		System.out.println(result);
	}

	private static String add(String a, String b) {
		double number1 = Double.valueOf(a);
		double number2 = Double.valueOf(b);
		return String.valueOf(number1 + number2);
	}

        private static String subtract(String a, String b) {
                double number1 = Double.valueOf(a);
                double number2 = Double.valueOf(b);
                return String.valueOf(number1 - number2);
        }

        private static String multiply(String a, String b) {
                double number1 = Double.valueOf(a);
                double number2 = Double.valueOf(b);
                return String.valueOf(number1 * number2);
        }

        private static String divide(String a, String b) {
                double number1 = Double.valueOf(a);
                double number2 = Double.valueOf(b);
                return String.valueOf(number1 / number2);
        }

        private static String mod(String a, String b) {
                int number1 = Integer.valueOf(a);
                int number2 = Integer.valueOf(b);
                return String.valueOf(number1 % number2);
        }


}
