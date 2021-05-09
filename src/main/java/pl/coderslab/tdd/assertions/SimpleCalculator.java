package pl.coderslab.tdd.assertions;

public class SimpleCalculator {

	public int add(int x, int y) {
		return x + y;
	}

	public int addPositve(int x, int y) {
		if (x <= 0 || y <= 0) {
			throw new IllegalArgumentException("Only positive");
		} else {
			return x + y;
		}
	}

	public int eval(String expression) {
		String[] split = expression.split("\\+");
		int result = 0;
		for (String a : split ) {
			result += Integer.parseInt(a);
		}
		return result;
	}
}
