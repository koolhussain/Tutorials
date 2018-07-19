#include<stdio.h>
void main()
{
	int l_digit, f_digit;
	int no, digit, temp;
	printf("Enter the No:\n");
	scanf("%d",&no);
	temp = no;
	while(no>0)
	{
		l_digit = temp % 10;
		f_digit = no % 10;
		no = no / 10;
	}
	printf("The sum of 1st & Last digit:%d\n", (f_digit+l_digit));
}