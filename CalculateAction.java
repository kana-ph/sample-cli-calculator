import java.util.Arrays;
import java.util.Optional;
import java.math.*;

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
	},
	POW {
		@Override
		public String calculate(String[] args) {
			double b = Double.valueOf(args[0]);
			double e = Double.valueOf(args[1]);
			return String.valueOf(Math.pow(b,e));
		}
	},
	SQRT {
		@Override
		public String calculate(String[] args) {
			double a = Double.valueOf(args[0]);
			return String.valueOf(Math.sqrt(a));
		}
	},
	CBRT {
		@Override
		public String calculate(String[] args) {
			double a = Double.valueOf(args[0]);
			return String.valueOf(Math.cbrt(a));
		}
	},
	ROOT {
		@Override
		public String calculate(String[] args) {
			double a = Double.valueOf(args[0]);
			double r = Double.valueOf(args[1]);
			return String.valueOf(Math.pow(Math.E, Math.log(a) / r));
		}
	},
	BASE2 {
		@Override
		public String calculate(String[] args) {
			return Integer.toBinaryString(Integer.parseInt(args[0]));
		}
	},
	BASE8 {
		@Override
		public String calculate(String[] args) {
			return Integer.toOctalString(Integer.parseInt(args[0]));
		}
	},
	BASE16 {
		@Override
		public String calculate(String[] args) {
			return Integer.toHexString(Integer.parseInt(args[0]));
		}
	},
	ROUND {
		@Override
		public String calculate(String[] args) {
			double factor = Math.pow(10,Double.valueOf(args[1]));
			return String.valueOf((double)Math.round(Double.valueOf(args[0])*factor)/factor);
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
	TRIAREA {
		@Override
		public String calculate(String[] args) {
			double a = Double.valueOf(args[0]);
			double b = Double.valueOf(args[1]);

			double area = (a * b) / 2;
			
			return String.valueOf(area);
		}
	};

	public abstract String calculate(String[] args);

	public static Optional<CalculateAction> of(String name) {
		return Arrays.stream(values())
			.filter(method -> method.name().equals(name.toUpperCase()))
			.findFirst();
	}
}
