#include<stdio.h>
#include<stdlib.h>
#include<string.h>

#define MAX 30

int top = -1;
char stack[MAX];

void push(char);
char pop();
int match(char a, char b);
int check(char exp[]);

void main()
{
	char exp[MAX];
	int valid;
	printf("Enter an Algebric Expression\n");
	fgets(exp, MAX-1, stdin);
	valid = check(exp);
	if(valid == 1)
	{
		printf("Valid Expression\n");
	}
	else
	{
		printf("Invalid Expression\n");
	}
}

char pop()
{
	if(top == -1)
	{
		printf("Stack Underflow\n");
		exit(1);
	}
	char item = stack[top];
	top = top - 1;
	return item;
}

void push(char data)
{
	if(top == MAX-1)
	{
		printf("Stack Overflow\n");
		return;
	}
	top = top + 1;
	stack[top] = data;
}

int match(char a, char b)
{
	if(a == '[' && b == ']')
	{
		return 1;
	}
	if(a == '{' && b == '}')
	{
		return 1;
	}
	if(a == '(' && b == ')')
	{
		return 1;
	}
	return 0;
}

int check(char exp[])
{
	int i;
	char temp;
	for(i = 0;i<strlen(exp);i++)
	{
		if(exp[i] == '(' || exp[i] == '{' || exp[i] == '[')
		{
			push(exp[i]);
		}

		if(exp[i] == ')' || exp[i] == '}' || exp[i] == ']')
		{
			if(top == -1)
			{
				printf("Right Parenthesis are more than Left Parenthesis\n");
				return 0;
			}
			else
			{
				temp = pop();
				if(!match(temp, exp[i]))
				{
					printf("Mismatched Parenthesis are: ");
					printf("%c and %c\n", temp, exp[i]);
					return 0;
				}
			}
		}
	}
	if(top == -1)
	{
		printf("Balanced Parenthesis\n");
		return 1;
	}
	else
	{
		printf("Left Parenthesis are more than Right Parenthesis\n");
		return 0;
	}
}




