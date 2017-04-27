import java.util.Arrays;

public enum CalculateMethod {
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
	HYPOTENUSE {
		@Override
		public String calculate(String[] args) {
			double a = Double.valueOf(args[0]);
			double b = Double.valueOf(args[1]);

			return String.valueOf(Math.hypot(a, b));
		}
	},
	SQAREA {
		@Override
		public String calculate(String[] args) {
			double a = Double.valueOf(args[0]);

			return String.valueOf(Math.pow(a, 2));
		}
	},
	RECTAREA {
		@Override
		public String calculate(String[] args) {
			double w = Double.valueOf(args[0]);
			double l = Double.valueOf(args[1]);

			return String.valueOf(w * l);
		}
	};

	public abstract String calculate(String[] args);

	public static CalculateMethod of(String name) {
		return Arrays.stream(values())
			.filter(method -> method.name().equals(name.toUpperCase()))
			.findFirst()
			.orElse(null);
	}
}
