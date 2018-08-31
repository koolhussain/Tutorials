#include<stdio.h>
#define MAX 20

void main()
{
	int arr[MAX];
	int i,j,temp,n,min;
	printf("Enter the No of Elements\n");
	scanf("%d",&n);

	for(i=0;i<n;i++)
	{
		printf("Enter the %d Element\n",i+1);
		scanf("%d",&arr[i]);
	}

	for(i=0;i<n-1;i++)
	{
		min = i;
		for(j=i+1;j<n;j++)
		{
			if(arr[min]>arr[j])
			{
				min = j;
			}
		}
		if(i != min)
		{
			temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		printf("Pass %d ",i);
		for(int k=0;k<n;k++)
		{
			printf("%d ",arr[k]);
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