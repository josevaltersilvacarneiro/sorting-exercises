// An algorithm sort any array 

public class SelectionSort
{
	public static void main(String[] args)
	{
		int lowest_value;
		int lowest_value_index;
		int[] my_array = {12, 25, 1, 0, -5, 6, 9, 15};

		// It prints the array before sorting it
		for (int i = 0; i < 8; i++)
		{
			System.out.println(my_array[i]);
		}
		
		for (int i = 0; i < 8; i++)
		{
			lowest_value = my_array[i];
			lowest_value_index = i;
			for (int j = i + 1; j < 8; j++)
			{
				if (my_array[j] < lowest_value)
				{
					lowest_value = my_array[j];
					lowest_value_index = j;
				}
			}

			my_array[lowest_value_index] = my_array[i];
			my_array[i] = lowest_value;
		}

		System.out.println("Array sorted: ");
		// It prints the array after sorting it 
		for (int i = 0; i < 8; i++)
		{
			System.out.println(my_array[i]);
		}
	}
}
