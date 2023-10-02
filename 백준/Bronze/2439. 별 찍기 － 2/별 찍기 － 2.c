#include<stdio.h>

int main()
{
    int i, j, k, a;
    scanf("%d", &a);
    
    for (i = 0; i < a; i++)
    {
        for (k = a-1; k > i; k--)
        {
            printf(" ");
        }
        
        for (j = 0; j <= i; j++)
        {
           
            printf("*");
        }
        printf("\n");
    }
    return 0;
}