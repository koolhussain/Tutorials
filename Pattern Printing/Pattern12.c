#include<stdio.h>
void main()
{
	int i,j,k;
	for(i=1;i<=5;i++)
	{
		for(k=1;k<=5-i+1;k++)
		{
			printf(" ");
		}
		for(j=1;j<=2*i-1;j++)
		{
			printf("*");
		}
		printf("\n");
	}
}