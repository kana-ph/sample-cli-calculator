import java.util.Arrays;

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
	SIN {
		@Override
		public String calculate(String[] args) {
			double rad = Double.valueOf(args[0]);
			return String.valueOf(Math.sin(rad));
		}
	},
	COS {
		@Override
		public String calculate(String[] args) {
			double rad = Double.valueOf(args[0]);
			return String.valueOf(Math.cos(rad));
		}
	},
	TAN {
		@Override
		public String calculate(String[] args) {
			double rad = Double.valueOf(args[0]);
			double sin = Math.sin(rad);
			double cos = Math.cos(rad);
			return String.valueOf(sin / cos);
		}
	};

	public abstract String calculate(String[] args);

	public static CalculateAction of(String name) {
		return Arrays.stream(values())
			.filter(method -> method.name().equals(name.toUpperCase()))
			.findFirst()
			.orElse(null);
	}
}
