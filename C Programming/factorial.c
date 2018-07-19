#include<stdio.h>
void main()
{
	int long fact = 1;
	int no, temp;
	printf("Enter the No:\n");
	scanf("%d",&no);
	temp = no;
	if(no == 1)
	{
		printf("Factorial of %d is %ld\n",no,fact);
		break;
	}
	while(temp>0)
	{
		fact = fact * temp;
		temp--;
	}
	printf("Factorial of %d is %ld\n",no,fact);
}