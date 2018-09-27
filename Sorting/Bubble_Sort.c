/*
Scans the array and exchange the adjacent elements if they are out of order
there are many swaps in a single pass
after 1st pass the largest element is at its proper place
after 2nd pass the 2nd largest element is at its proper place

Data is in Sorted Order:-
Time Complexity: O(n)

Data is in Reverse Order:-
Time Complexity: O(n*n)
*/
#include<stdio.h>
#define MAX 20
void main()
{
    int arr[MAX];
    int i, j, x, temp, n;
    int min;
    printf("Enter the No of Elements\n");
    scanf("%d",&n);
    printf("Enter the Elements of the Array\n");
    for(i=0;i<n;i++)
    {
        printf("Enter Element %d ",i+1);
        scanf("%d",&arr[i]);
    }

    for(i=0;i<n-1;i++)
    {
        x=0;
        for(j=0;j<n-1-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                x++;
            }
        }
        if(x==0)
        {
            break;
        }
    }

    printf("The Sorted Array is\n");
    for(i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }
}
