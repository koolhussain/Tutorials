/*
*/
#include<stdio.h>
#define MAX 20
void main()
{
    int arr[MAX];
    int i, j, k, n, p;
    printf("Enter the No of Elements\n");
    scanf("%d",&n);
    printf("Enter the Elements of the Array\n");
    for(i=0;i<n;i++)
    {
        printf("Enter Element %d ",i+1);
        scanf("%d",&arr[i]);
    }

    for(i=1;i<n;i++)
    {
        k = arr[i];
        for(j=i-1; j>=0 && k<arr[j]; j--)
        {
            arr[j+1] = arr[j];
           /* for(p=0;p<n;p++)
            {
                printf("%d ",arr[p]);
            }
            printf("\n%d\n",i);*/
        }
        arr[j+1]=k;
        /*for(p=0;p<n;p++)
        {
            printf("%d ",arr[p]);
        }
        printf("\n");*/
    }

    printf("The Sorted Array is\n");
    for(i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }
}
