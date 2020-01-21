public class Exercises {

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		}

		// write your code here
		if  (a[0] == b[0] || a[a.length-1] == b[b.length-1]) {
			return true;
		} else {
			return false;	// default return value to ensure compilation
		}
	}

	public String[] endsMeet(String[] values, int n) {

		String empty[] = new String[0];

		if (values == null || values.length < n || n < 0) {
			return empty;
		}
		// write your code here

		String result[] = new String[n * 2];
		int length = values.length;
		int index = n;

		for (int i = 0; i < n; i++) {
			result [i] = values[i];
		}

		for (int x = n; x < 2 * n; x++) {
				result[x] = values[length - index];
				index--;
		}

		return result;

		// return null;	// default return value to ensure compilation
	}

	public int difference(int[] numbers) {

		// write your code here
		if (numbers == null || numbers.length < 1) {
			return -1;
		}

		int numMax = 0;
		int numMin = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (i == 0) {
				numMax = numbers[i];
				numMin = numbers[i];
			}
			if (numMax < numbers[i]) {
				numMax = numbers[i];
			}
			if (numMin > numbers[i]) {
				numMin = numbers[i];
			}
		}

		int differnce = numMax - numMin;
		return differnce;

	}

	public double biggest(double[] numbers) {
		if (numbers == null || numbers.length < 3 || numbers.length % 2 == 0){
			return -1;
		}
		// write your code here
		double max = numbers[0];
		if (max <= numbers[numbers.length - 1])
				max = numbers[numbers.length - 1];
		if (max <= numbers[numbers.length / 2])
				max = numbers[numbers.length / 2];
				return max;

			// return -1;		// default return value to ensure compilation
		}

		public String[] middle(String[] values) {
				// write your code here

				String empty[] = new String[0];

				if (values == null || values.length < 3 || values.length % 2 == 0) {
					return empty;
				}

				boolean containsNull = false;
				for (int i = 0; i < values.length; i++) {
					if (values[i] == null) {
						containsNull = true;
					}
				}

				if (containsNull) {
					return empty;
				}


				int half = values.length / 2;
				int first = half - 1;
				int last = half + 1;

				String[] result = {values[first], values[half], values[last]};

				return result;

				// return null;	// default return value to ensure compilation
			}

	public boolean increasing(int[] numbers) {
		if (numbers == null || numbers.length < 3){
			return false;
		}

		for (int i = 1; i < numbers.length - 1; i ++) {
			if (numbers[i-1] < numbers[i] && numbers[i] < numbers [i+1]){
				return true;
			}
		}
	return false;	// default return value to ensure compilation
}
/*
	public boolean everywhere(int[] numbers, int x) {
		if (values == null || values < 1){
			return false;
		}
		// write your code here

		return false;	// default return value to ensure compilation
	}
*/
public boolean consecutive(int[] numbers) {

	// write your code here
	if (numbers == null || numbers.length < 3) {
		return false;
	}

	for (int i = 1; i < numbers.length - 1; i++) {
		if (numbers[i - 1] % 2 == 0 && numbers[i] % 2 == 0 && numbers[i + 1] % 2 == 0) {
			return true;
		} else if (numbers[i - 1] % 2 == 1 && numbers[i] % 2 == 1 && numbers[i + 1] % 2 == 1) {
			return true;
		}
	}
	return false;	// default return value to ensure compilation
}

/*
	public boolean balance(int[] numbers) {
		if (numbers == null || numbers < 2){
			return false;
		}
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public int clumps(String[] values) {
		if (values == null){
			return -1;
		}

		boolean containsNull = false;
		for (int i = 0; i < values.length; i++){
			if (values[i] == null){
				containsNull = true;
			}
		}

		if (containsNull) {
			return -1;
		}

		// write your code here

		return -1;		// default return value to ensure compilation
	}
	*/
}
