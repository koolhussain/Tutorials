#include<stdio.h>
#define MAX 20

void main()
{
	int i,j,k,n;
	int arr[MAX];

	printf("Enter the Size of Array\n");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		printf("Enter %d Element:",i+1);
		scanf("%d",&arr[i]);
	}

	for(i=1;i<n;i++)
	{
		k = arr[i];
		for(j=i-1; j>=0 && k<arr[j];j--)
		{
			arr[j+1] = arr[j];
		}
		arr[j+1] = k;
		for(int l=0;l<n;l++)
		{
			printf("%d ",arr[l]);
		}
		printf("\n");
	}

	printf("Sorted List is:\n");
	for(i=0;i<n;i++)
	{
		printf("%d ",arr[i]);
	}
	printf("\n");
}