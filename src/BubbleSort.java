
public class BubbleSort 
{
	public static void main(String[] args)
	{
		int auxiliar;
		int[] my_array = {12, 25, 1, 0, -5, 6, 9, 15};

		// It prints the array before sorting it
		for (int i = 0; i < 8; i++)
		{
			System.out.println(my_array[i]);
		}

		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8 - i - 1; j++)
			{
				if (my_array[j] > my_array[j + 1])
				{
					auxiliar = my_array[j];
					my_array[j] = my_array[j + 1];
					my_array[j + 1] = auxiliar;
				}
			}
		}

		System.out.println("Array sorted: ");
		// It prints the array after sorting it
		for (int i = 0; i < 8; i++)
		{
			System.out.println(my_array[i]);
		}
	}
}
