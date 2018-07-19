#include<stdio.h>
#include<math.h>
void main()
{
	int x,y,x1,y1;
	int r, dist;
	printf("Enter the Co-ordinates of the circle\n");
	scanf("%d%d",&x,&y);
	printf("Radius of the Circle\n");
	scanf("%d",&r);
	printf("Enter the Co-ordinates\n");
	scanf("%d%d",&x1,&y1);

	dist = sqrt(pow((x1-x),2)+pow((y1-y),2));

	if(dist < r)
	{
		printf("The point Lies inside the Circle\n");
	}
	else if(dist == r)
	{
		printf("The point lies on the Circle\n");
	}
	else
	{
		printf("The Point lies outside the circle\n");
	}
}