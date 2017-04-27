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
			return String.valueOf(Math.sin(rad) / Math.cos(rad));
		}
	},
	CSC {
		@Override
		public String calculate(String[] args) {
			double rad = Double.valueOf(args[0]);
			return String.valueOf(1 / Math.sin(rad));
		}
	},
	SEC {
		@Override
		public String calculate(String[] args) {
			double rad = Double.valueOf(args[0]);
			return String.valueOf(1 / Math.cos(rad));
		}
	},
	COT {
		@Override
		public String calculate(String[] args) {
			double rad = Double.valueOf(args[0]);
			return String.valueOf(1 / Math.tan(rad));
		}
	}
	;

	public abstract String calculate(String[] args);

	public static Optional<CalculateAction> of(String name) {
		return Arrays.stream(values())
			.filter(method -> method.name().equals(name.toUpperCase()))
			.findFirst();
	}
}
