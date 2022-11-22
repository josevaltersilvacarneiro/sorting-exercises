
public class InsertionSort
{
	public static void main(String[] args)
	{
		int auxiliar;
		int[] my_array = {12, 25, 1, 0, -5, 6, 9, 15};
		int j;

		// It prints the array before sorting it
		for (int i = 0; i < 8; i++)
		{
			System.out.println(my_array[i]);
		}

		for (int i = 1; i < 8; i++)
		{
			auxiliar = my_array[i];
			j = i - 1;

			while (j >= 0 && my_array[j] > auxiliar)
			{	
				my_array[j + 1] = my_array[j];
				j--;
			}

			my_array[j + 1] = auxiliar;
		}

		System.out.println("Array sorted: ");
		// It prints the array after sorting it
		for (int i = 0; i < 8; i++)
		{
			System.out.println(my_array[i]);
		}
	}
}
