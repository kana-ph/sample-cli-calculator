import java.util.Arrays;

public class Calculate {
	public static void main(String[] args) {
		CalculateAction method = CalculateAction.of(args[0]);
		String[] methodArgs = Arrays.copyOfRange(args, 1, args.length);

		String result = method.calculate(methodArgs);
		System.out.println(result);
	}
}
