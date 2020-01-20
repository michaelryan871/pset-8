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
		if (values == null || values.length < n|| n < 0) {
			return false; 
		}
		// write your code here

		return null;	// default return value to ensure compilation
	}

	public int difference(int[] numbers) {
		if (numbers == null || numbers < 1) {
			return false; 
		}
		// write your code here

		return -1;		// default return value to ensure compilation
	}

	public double biggest(double[] numbers) {
		if (numbers == null || numbers < 3 || numbers.length % 2 == 0){
			return -1; 
		}
		// write your code here

		return -1;		// default return value to ensure compilation
	}

	public String[] middle(String[] values) {
		if (numbers == null || numbers < 3 || numbers.length % 2 == 0){
			return null; 
		}
		// write your code here

		return null;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		if (numbers == null || numbers < 3){
			return false;
		}
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean everywhere(int[] numbers, int x) {
		if (values == null || values < 1){
			return false; 
		}
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean consecutive(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public boolean balance(int[] numbers) {
		// write your code here

		return false;	// default return value to ensure compilation
	}

	public int clumps(String[] values) {
		// write your code here

		return -1;		// default return value to ensure compilation
	}
}
