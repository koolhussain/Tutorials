#include<stdio.h>
#include<stdlib.h>
#include<string.h>

#define MAX 20

int top = -1;
char stack_arr[MAX];

char pop();
void push(char data);

void main()
{
	char str[20];
	int i;
	printf("Enter a String\n");
	fgets(str, MAX-1, stdin);
	for(i=0; i<=strlen(str)-1;i++)
	{
		push(str[i]);
	}
	for(i=0;i<strlen(str);i++)
	{
		str[i] = pop();
	}
	printf("Reversed String is:\n");
	fputs(str, stdout);
	printf("\n");
}

void push(char data)
{
	if(top == MAX-1)
	{
		printf("Stack Overflow\n");
		return;
	}
	top = top +1;
	stack_arr[top] = data;
}

char pop()
{
	int item;
	if(top == -1)
	{
		printf("Stack Underflow\n");
		exit(1);
	}
	item = stack_arr[top];
	top = top -1;
	return item;
}