/*
Find Index of the Smallest element & store it in min variable
Swap with i th value of arr[]

Advantages:-
1.Data Movement is Minimum
2.If Element is at the Proper place it won't be moved
3.If records are large Selection Sort works better than BubbleSort & Insertion Sort
Time Complexity is O(n*n)
Space Complexity is O(1)
In-Place Sort = TRUE
Stable Sort = FALSE
*/

#include<stdio.h>
#define MAX 20
void main()
{
    int arr[MAX];
    int i, j, temp, n;
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
        min = i;
        for(j=i+1;j<n;j++)
        {
            if(arr[min]>arr[j])
            {
                min = j;
            }
        }
        if(i!=min)
        {
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    printf("The Sorted Array is\n");
    for(i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }
}
