#include<stdio.h>
void main()
{
	int no, rev = 0;
	int digit;
	printf("Enter the No:\n");
	scanf("%d",&no);
	while(no > 0)
	{
		rev = rev*10;
		digit = no % 10;
		rev = rev + digit;
		no = no / 10;
	}
	printf("The Reversed No is:%d\n",rev);
}