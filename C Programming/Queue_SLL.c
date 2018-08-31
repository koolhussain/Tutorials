#include <stdio.h>
#include <stdlib.h>
struct node
{
	int data;
	struct node *link;
};

struct node *front = NULL;
struct node *rear = NULL;

void insert(int data);
int delete();
int peek();
void display();
int isEmpty();

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

void display()
{
	struct node *p;
	if(isEmpty())
	{
		printf("Queue is Empty\n");
		exit(1);
	}
	p = front;
	while(p!=NULL)
	{
		printf("%d",p->data);
		p=p->link;
	}
	printf("\n");
}

int peek()
{
	if(isEmpty())
	{
		printf("Queue is Empty\n");
		exit(1);
	}
	return front->data;
}

int delete()
{
	struct node *temp;
	if(isEmpty())
	{
		printf("Queue is Empty\n");
		exit(1);
	}
	temp = front;
	int item = front->data;
	front = temp->link;
	free(temp);
	return item;
}

void insert(int data)
{
	struct node *temp = (struct node *)malloc(sizeof(struct node));
	if(temp == NULL)
	{
		printf("Memory Unavailable\n");
		return ;
	}
	temp->data = data;
	temp->link = NULL;
	if(front == NULL)
	{
		front = temp;
	}
	else
	{
		rear->link = temp;
	}
	rear = temp;
}

int isEmpty()
{
	if(front == NULL)
	{
		return 1;
	}
	else
	{
		return 0;
	}
}