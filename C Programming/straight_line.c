#include<stdio.h>
void main()
{
	int x1,x2,x3,y1,y2,y3;
	printf("Enter the Co-ordinates\n");
	scanf("%d%d%d%d%d%d",&x1,&y1,&x2,&y2,&x3,&y3);
	if((y2-y1)*(x3-x2) == (y3-y2)*(x2-x1))
	{
		printf("Yes\n");
	}
	else
	{
		printf("No\n");
	}
}