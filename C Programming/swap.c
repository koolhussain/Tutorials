#include<stdio.h>

void main()
{
	int a,b;
	printf("Enter the Nos\n");
	scanf("%d%d",&a,&b);
	printf("Original Nos: %d, %d\n",a,b);
	int temp;
	temp = a;
	a = b;
	b = temp;
	printf("Swapped Nos: %d, %d\n",a,b);
}