#include <stdio.h>
#include <stdlib.h>
#define MAX 10

int front = -1;
int rear = -1;
int queue[MAX];

void insert(int data);
int delete();
int peek();
void display();
int isEmpty();
int isFull();

void main()
{
	int item, data, choice;
	while(1)
	{
		printf("1.Insert\n");
		printf("2.Delete\n");
		printf("3.Peek\n");
		printf("4.Display\n");
		printf("5.Quit\n");
		printf("Enter your Choice\n");
		scanf("%d",&choice);
		switch(choice)
		{
			case 1:
				printf("Enter the ELement to Push\n");
				scanf("%d",&data);
				insert(data);
				break;
			case 2:
				item = delete();
				printf("The Popped item: %d\n",item);
				break;
			case 3:
				printf("The Top Element is: %d\n",peek());
				break;
			case 4:
				printf("The Elements of the Stack are:\n");
				display();
				break;
			case 5:
				exit(1);
			default:
				printf("Invalid Choice\n");
		}
	}
}

void insert(int data)
{
	if(isFull())
	{
		printf("Queue is Full\n");
		return;
	}
	if(front == -1)
	{
		front = 0;
	}
	rear = rear + 1;
	queue[rear] = data;
}

int delete()
{
	if(isEmpty())
	{
		printf("Queue is Empty\n");
		exit(1);
	}
	int item = queue[front];
	front = front + 1;
	return item;
}

int peek()
{
	if(isEmpty())
	{
		printf("Queue is Empty\n");
		exit(1);
	}
	return queue[front];
}

void display()
{
	if(isEmpty())
	{
		printf("Queue is Empty\n");
		return;
	}
	int i;
	for(i = front; i<= rear; i++)
	{
		printf("%d",queue[i]);
	}
	printf("\n");
}

int isFull()
{
	if(rear == MAX -1)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}

int isEmpty()
{
	if(front == -1 || front == rear+1)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}
