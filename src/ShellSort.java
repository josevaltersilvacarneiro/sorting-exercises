public class ShellSort
{
	public static void main(String[] args)
	{
		int h = 1;
		int key, j;
		int[] myArray = {12, 25, 1, 0, -5, 6, 9, 15};

		// It prints the array before sorting it
		for (int i = 0; i < myArray.length; i++)
			System.out.printf("%d;", myArray[i]);

		while (h < myArray.length)
			h = h * 3 + 1;

		h /= 3; // h = h * 3;

		while (h > 0) {
			for (int i = h; i < myArray.length; i++) {
				key = myArray[i];
				j = i; // Before j = i-1;

				while (j >= h && myArray[j - h] > key) { // Before (j >= 0 && myArray[j] > key)
					myArray[j] = myArray[j - h]; // Before myArray[j+1] = myArray[j];
					j -= h; // Before j--;
				}

				myArray[j] = key; // Before myArray[j+1] = key;
			}
			h /= 2; // h = h / 2;
		}

		// It prints the array after sorting it
		System.out.printf("%nArray sorted:%n");
		for (int i = 0; i < myArray.length; i++)
			System.out.printf("%d;", myArray[i]);
		System.out.println();
	}
}
