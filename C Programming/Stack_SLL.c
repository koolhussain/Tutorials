#include<stdio.h>
#include<stdlib.h>

struct node
{
	int data;
	struct node *link;
};
struct node *top = NULL;
void push(int data);
int pop();
int peek();
int isEmpty();
void display();

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
	struct node *p;
	if(top == NULL)
	{
		printf("Stack Underflow\n");
		return;
	}
	p = top;
	while(p!=NULL)
	{
		printf("%d\n",p->data);
		p = p->link;
	}
	printf("\n");
}

int peek()
{
	if(top == NULL)
	{
		printf("Stack Underflow\n");
		exit(1);
	}
	return top->data;
}

int pop()
{
	if(top == NULL)
	{
		printf("Stack Underflow\n");
		exit(1);
	}
	struct node *temp;
	int item;
	temp = top;
	top = temp->link;
	item = temp->data;
	free(temp);
	return item;
}

void push(int data)
{
	struct node *temp;
	temp = (struct node *)malloc(sizeof(struct node));
	if(temp == NULL)
	{
		printf("Stack Overflow\n");
		return;
	}
	temp->data = data;
	temp->link = top;
	top = temp;
}