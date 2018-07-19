#include<stdio.h>
void main()
{
	int no;
	int tens=0, fifties=0, hundreds=0;
	printf("Enter the No\n");
	scanf("%d",&no);
	if(no>0)
	{
		if(no>=100)
		{
			hundreds = no / 100; 
			no = no - (hundreds*100);
		}
		if(no>=50)
		{
			fifties = no / 50;
			no = no - (fifties*50);
		}
		if(no>=10)
		{
			tens = no / 10;
			no = no - (tens*10);
		}
	}
	printf("The Denomination\n");
	printf("Ten:%d\n",tens);
	printf("Fifty:%d\n",fifties);
	printf("Hundred:%d\n",hundreds);
}