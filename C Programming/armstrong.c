#include<stdio.h>
void main()
{
	int arm, no, digit, original;
	arm = 0;
	printf("Enter the No:\n");
	scanf("%d",&no);
	original = no;
	while(original!=0)
	{
		digit = original%10;
		arm = arm + (digit*digit*digit);
		original = original/10;
	}
	if(no == arm)
	{
		printf("Armstrong No\n");
	}
	else
	{
		printf("Not Armstrong\n");
	}
}