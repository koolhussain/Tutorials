#include<stdio.h>
void main()
{
	int no, temp, digit;
	int long rev = 0;

	printf("Enter the No\n");
	scanf("%d",&no);
	temp = no;
	while(no>0)
	{
		rev = rev*10;
		digit = no % 10;
		rev = rev + digit;
		no = no / 10;
	}
	printf("No: %d\nRev No: %ld\n",temp,rev);
	if(temp == rev)
	{
		printf("Palindrome\n");
	}
	else
	{
		printf("Not a Palindrome\n");
	}
}