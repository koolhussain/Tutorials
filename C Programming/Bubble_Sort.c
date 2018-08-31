#include<stdio.h>
#define MAX 20

void main()
{
	int arr[MAX];
	int i,j,temp,n,ex;
	printf("Enter the No of Elements\n");
	scanf("%d",&n);

	for(i=0;i<n;i++)
	{
		printf("Enter the %d Element\n",i+1);
		scanf("%d",&arr[i]);
	}

	for(i=0;i<n-1;i++)
	{
		ex = 0;
		for(j=0;j<n-1-i;j++)
		{
			if(arr[j] > arr[j+1])
			{
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				ex++;
			}
		}
		if(ex==0)
		{
			printf("List is Sorted\n");
			break;
		}
		printf("Pass %d ",i);
		for(int k=0;k<n;k++)
		{
			printf("%d ",arr[k]);
			printf("%d",ex);
		}
		printf("\n");
	}
	printf("Sorted Array\n");
	for(i=0;i<n;i++)
	{
		printf("%d ",arr[i]);
	}
	printf("\n");
}