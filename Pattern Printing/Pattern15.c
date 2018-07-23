#include<stdio.h>
void main()
{
	int i,j,k;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=5-i+1;j++)
		{
			printf(" ");
		}
		for(k=1;k<=2*i-1;k++)
		{
			printf("*");
		}
		printf("\n");
	}
	for(i=1;i<=4;i++)
	{
		for(k=1;k<=1;k++)
		{
			printf(" ");
		}
		for(j=1;j<=9;j++)
		{
			if((i>1) && (j==4||j==5||j==6))
			{
				printf(" ");
			}
			else
			{
				printf("*");
			}
		}
		printf("\n");
	}
}

