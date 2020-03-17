/*
    Iterative BinarySearch Algorithm.

	* @param arr: array
	* @param l: start index
	* @param r: end index
	* @param x: element to be searched
	* @return : location of x if present,otherwise -1
*/

int binarySearch(int arr[], int l, int r, int x)
{
	while (l <= r)
	{
		int m =(r-l)/2;

		// Check if x is present at mid
		if (arr[m] == x)
		return m;

		// If x greater, ignore left half
		if (arr[m] < x)
		l = m + 1;

		// If x is smaller, ignore right half
		else
		r = m - 1;
	}
	return -1;
}
