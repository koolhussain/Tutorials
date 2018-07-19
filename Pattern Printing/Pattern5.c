#include<stdio.h>
void main()
{
	int i,j,k;
	for(i=1;i<5;i++)
	{
		for(k=1;k<=5;k++)
		{
			printf(" ");
		}
		for(j=1;j<=5;j++)
		{
			printf("*");
		}
		printf("\n");
	}
}