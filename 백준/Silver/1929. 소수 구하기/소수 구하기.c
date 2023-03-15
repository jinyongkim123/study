#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>



int main()
{
	int a, b;
	int arr[1000000] = { 0 };
	scanf("%d %d", &a, &b);
	arr[1] = 1;

	for (int i = 2; i <= b; i++)
	{
		for (int j = 2; i * j <= b; j++)
		{

			arr[i * j] = 1;

		}
	}
	for (int i = a; i <= b; i++)
	{
		if (arr[i] == 0)
		{
			printf("%d\n", i);
		}
	}



	return 0;
}