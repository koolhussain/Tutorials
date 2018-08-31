#include<stdio.h>
#include<stdlib.h>

struct node
{
	int info;
	struct node *link;
};

struct node *create_list(struct node *start);
struct node *add_at_begin(struct node *start, int data);
struct node *add_at_end(struct node *start, int data);
struct node *add_after(struct node *start, int item, int data);
struct node *add_before(struct node *start, int item, int data);
struct node *add_at_pos(struct node *start, int pos, int data);
struct node *del(struct node *start, int data);
struct node *reverse(struct node *start);
void display(struct node *start);
void count(struct node *start);
void search(struct node *start, int data);

void main()
{
	struct node *start = NULL;
	int choice, data, pos, item;
	while(1)
	{
		printf("1.Create List\n");
		printf("2.Add at Beginning\n");
		printf("3.Add at End\n");
		printf("4.Add after a Node\n");;
		printf("5.Add before a Node\n");
		printf("6.Add at Position\n");
		printf("7.Delete\n");
		printf("8.Reverse\n");
		printf("9.Display\n");
		printf("10.Count\n");
		printf("11.Search\n");
		printf("12.Quit\n");

		printf("Enter your Choice\n");
		scanf("%d",&choice);

		switch(choice)
		{
			case 1:
			{
				start = create_list(start);
				break;
			}
			case 2:
			{
				printf("Enter the Element to Insert\n");
				scanf("%d",&data);
				start = add_at_begin(start, data);
				break;
			}
			case 3:
			{
				printf("Enter the Element to Insert\n");
				scanf("%d",&data);
				start = add_at_end(start, data);
				break;
			}
			case 4:
			{
				printf("Enter the Element after which you want to insert\n");
				scanf("%d",&item);
				printf("Enter the Element to Insert\n");
				scanf("%d",&data);
				start = add_after(start, item, data);
				break;
			}
			case 5:
			{
				printf("Enter the Element before which you want to insert\n");
				scanf("%d",&item);
				printf("Enter the Element to Insert\n");
				scanf("%d",&data);
				start = add_before(start, item, data);
				break;
			}
			case 6:
			{
				printf("Enter the Position at which you want to Insert\n");
				scanf("%d",&pos);
				printf("Enter the Element to Insert\n");
				scanf("%d",&data);
				start = add_at_pos(start, pos, data);
				break;
			}
			case 7:
			{
				printf("Enter the Element to be Deleted\n");
				scanf("%d",&data);
				start = del(start, data);
				break;
			}
			case 8:
			{
				start = reverse(start);
				break;
			}
			case 9:
			{
				display(start);
				break;
			}
			case 10:
			{
				count(start);
				break;
			}
			case 11:
			{
				printf("Enter the Element to Find\n");
				scanf("%d",&item);
				search(start, item);
				break;
			}
			case 12:
			{
				exit(1);
			}
			default:
			{
				printf("Wrong Choice\n");
			}
		}
	}
}

void search(struct node *start, int data)
{
	struct node *p;
	int pos = 1;
	p = start;
	while(p != NULL)
	{
		if(p->info == data)
		{
			printf("Item %d found at Position %d\n",data,pos);
			return;
		}
		p = p->link;
		pos++;
	}
	printf("Item %d not found in list\n",data);
}

void count(struct node *start)
{
	struct node *p;
	int count = 0;
	p = start;
	while(p != NULL)
	{
		count++;
		p = p->link;
	}
	printf("Count= %d",count);
	printf("\n");
}

void display(struct node *start)
{
	struct node *p;
	if(start == NULL)
	{
		printf("The List is Empty\n");
		return ;
	}
	p = start;
	while(p!=NULL)
	{
		printf("%d ",p->info);
		p = p->link;
	}
	printf("\n");
}

struct node *reverse(struct node *start)
{
	struct node *prev, *ptr, *next;
	prev = NULL;
	ptr = start;
	while(ptr!=NULL)
	{
		next = ptr->link;
		ptr->link = prev;
		prev = ptr;
		ptr = next;
	}
	start = prev;
	return start;
}

struct node *del(struct node *start, int data)
{
	struct node *temp, *p;
	if(start == NULL)
	{
		printf("List is Empty\n");
		return start;
	}

	if(start->info == data)
	{
		temp = start;
		start = start->link;
		free(temp);
		return start;
	}
	p = start;
	while(p->link != NULL)
	{
		if(p->link->info == data)
		{
			temp = p->link;
			p->link = temp->link;
			free(temp);
			return start;
		}
		p = p->link;
	}
	printf("The Element is not Present in the List\n");
	return start;
}

struct node *create_list(struct node *start)
{
	int n, data;
	printf("Enter the No of Nodes\n");
	scanf("%d",&n);
	start = NULL;
	if(n == 0)
	{
		return start;
	}
	printf("Enter the Element to Insert\n");
	scanf("%d",&data);
	start = add_at_begin(start, data);
	for(int i=2;i<=n;i++)
	{
		printf("Enter the Element to Insert\n");
		scanf("%d",&data);	
		start = add_at_end(start, data);
	}
	return start;
}

struct node *add_at_pos(struct node *start, int pos, int data)
{
	struct node *temp, *p;
	int i;
	temp = (struct node *)malloc(sizeof(struct node));
	temp->info = data;
	if(pos == 1)
	{
		temp->link = start;
		start = temp;
		return start;
	}
	p = start;
	for(int i=1;i<pos-1 && p!=NULL; i++)
	{
		p = p->link;
	}
	if(p == NULL)
	{
		printf("There are Less Elements than Expected\n");
	}
	else
	{
		temp->link = p->link;
		p->link = temp;
	}
	return start;
}

struct node *add_before(struct node *start, int item, int data)
{
	struct node *temp, *p;
	if(start == NULL)
	{
		printf("List is Empty\n");
		return start;
	}
	if(item == start->info)
	{
		temp = (struct node *)malloc(sizeof(struct node));
		temp->info = data;
		temp->link = start;
		start = temp;
		return start;
	}
	p = start;
	while(p->link != NULL)
	{
		if(p->link->info == item)
		{
			temp = (struct node *)malloc(sizeof(struct node));
			temp->info = data;
			temp->link = p->link;
			p->link = temp;
			return start;
		}
		p = p->link;
	}
	printf("Item not present in the List\n");
	return start;
}

struct node *add_after(struct node *start, int item, int data)
{
	struct node *temp, *p;
	p = start;
	while(p!=NULL)
	{
		if(p->info == item)
		{
			temp = (struct node *)malloc(sizeof(struct node));
			temp->info = data;
			temp->link = p->link;
			p->link = temp;
			return start;
		}
		p = p->link;
	}
	printf("Item not Present in the List\n");
	return start;
}

struct node *add_at_end(struct node *start, int data)
{	
	struct node *temp, *p;
	temp = (struct node *)malloc(sizeof(struct node));
	temp->info = data;
	p = start;
	while(p->link!=NULL)
	{
		p = p->link;
	}
	p->link = temp;
	temp->link = NULL;
	return start;
}

struct node *add_at_begin(struct node *start, int data)
{
	struct node *temp;
	temp = (struct node *)malloc(sizeof(struct node));
	temp->info = data;
	temp->link = start;
	start = temp;
	return start;
}