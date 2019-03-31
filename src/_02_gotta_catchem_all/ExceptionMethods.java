package _02_gotta_catchem_all;

import java.util.ArrayList;

public class ExceptionMethods {

	public double divide(double a, double b) throws IllegalArgumentException {
		double c = a / b;
		if (c == 0.0) {
			throw new IllegalArgumentException();
		}
		return c;
	}

	public String reverseString(String a) throws IllegalStateException {
		ArrayList<String> b = new ArrayList<String>();
		if (a.equals("")) {
			throw new IllegalStateException();
		}
		for (int i = 0; i < a.length(); i++) {
			String c = a.substring(i, i + 1);
			b.add(c);
		}
		String d = "";
		for (int i = b.size() - 1; i > -1; i--) {
			d += b.get(i);
		}
		return d;
	}

}
