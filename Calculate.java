import java.util.Arrays;

public class Calculate {
	public static void main(String[] args) {
		String[] methodArgs = Arrays.copyOfRange(args, 1, args.length);

		CalculateAction.of(args[0])
			.map(method -> method.calculate(methodArgs))
			.ifPresent(System.out::println);
	}
}
