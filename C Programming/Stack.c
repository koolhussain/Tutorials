#include <stdio.h>
#include <stdlib.h>
#define MAX 20
int top = -1;
int stack_arr[MAX];
void push(int data);
int pop();
int peek();
void display();
int isEmpty();
int isFull();
void main()
{
	int item, data, choice;
	while(1)
	{
		printf("1.Push\n");
		printf("2.Pop\n");
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
				push(data);
				break;
			case 2:
				item = pop();
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

void display()
{
	if(isEmpty())
	{
		printf("Stack is Empty\n");
		return;
	}
	printf("Stack ELements are:\n");
	for(int i = top; i>=0; i--)
	{
		printf("%d\n",stack_arr[i]);
	}
	printf("\n");
}

void push(int data)
{
	if(isFull())
	{
		printf("Stack is Full\n");
		return ;
	}
	top = top +1;
	stack_arr[top] = data;
}

int pop()
{
	int item;
	if(isEmpty())
	{
		printf("Stack is Empty\n");
		exit(1);
	}
	item = stack_arr[top];
	top = top-1;
	return item;
}

int peek()
{
	if(isEmpty())
	{
		printf("Stack is Empty\n");
		exit(1);
	}
	return stack_arr[top];
}

int isFull()
{
	if(top == MAX-1)
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
	if(top == -1)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}