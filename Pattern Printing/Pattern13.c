#include<stdio.h>
void main()
{
	int i,j,k;
	for(i=1;i<=5;i++)
	{
		for(k=1;k<=i;k++)
		{
			printf(" ");
		}
		for(j=1;j<=2*(5-i+1)-1;j++)
		{
			printf("*");
		}
		printf("\n");
	}
}