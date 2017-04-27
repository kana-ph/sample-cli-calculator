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
	SIN {
		@Override
		public String calculate(String[] args) {
			Double rad = Double.valueOf(args[0]);
			return String.valueOf(Math.sin(rad));
		}
	},
	COS {
		@Override
		public String calculate(String[] args) {
			Double rad = Double.valueOf(args[0]);
			return String.valueOf(Math.cos(rad));
		}
	},
	TAN {
		@Override
		public String calculate(String[] args) {
			Double rad = Double.valueOf(args[0]);
			return String.valueOf(Math.tan(rad));
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
