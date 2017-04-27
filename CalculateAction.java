import java.util.Arrays;
import java.util.Optional;

public enum CalculateAction {
	ADD {
		@Override
		public String calculate(String[] args) {
			double a = Double.valueOf(args[0]);
			double b = Double.valueOf(args[1]);
			return String.valueOf(a + b);
		}
	},
	SUBTRACT {
		@Override
		public String calculate(String[] args) {
			double a = Double.valueOf(args[0]);
			double b = Double.valueOf(args[1]);
			return String.valueOf(a - b);
		}
	},
	MULTIPLY {
		@Override
		public String calculate(String[] args) {
			double a = Double.valueOf(args[0]);
			double b = Double.valueOf(args[1]);
			return String.valueOf(a * b);
		}
	},
	DIVIDE {
		@Override
		public String calculate(String[] args) {
			double a = Double.valueOf(args[0]);
			double b = Double.valueOf(args[1]);
			return String.valueOf(a / b);
		}
	},
	MOD {
		@Override
		public String calculate(String[] args) {
			int a = Integer.valueOf(args[0]);
			int b = Integer.valueOf(args[1]);
			return String.valueOf(a % b);
		}
	},
	DEG {
		@Override
		public String calculate(String[] args) {
			double deg = Math.toDegrees(Double.valueOf(args[0]));
			return String.valueOf(deg);
		}
	},
	RAD {
		@Override
		public String calculate(String[] args) {
			double rad = Math.toRadians(Double.valueOf(args[0]));
			return String.valueOf(rad);
		}
	},
	ABS {
		@Override
		public String calculate(String[] args) {
			double abs = Math.abs(Double.valueOf(args[0]));
			return String.valueOf(abs);
		}
	};

	public abstract String calculate(String[] args);

	public static Optional<CalculateAction> of(String name) {
		return Arrays.stream(values())
			.filter(method -> method.name().equals(name.toUpperCase()))
			.findFirst();
	}
}
