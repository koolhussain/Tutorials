#include<stdio.h>

void main()
{
	int no, sum=0;
	int digit;
	printf("Enter the No\n");
	scanf("%d",&no);
	while(no > 0)
	{
		digit = no % 10;
		sum = sum + digit;
		no = no / 10;
	}
	printf("The Sum of Digits:%d\n",sum);
}