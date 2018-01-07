#include<stdio.h>
#include<conio.h>
int main()
{
	long int i;
	printf("input:");
	scanf("%ld",&i);
	printf("output:");
	if(i<=0.0)
	{
		if(i==0.0)
		printf("entered value is zero it both positive and negative\t");
		else
		printf("NEGATIVE\t");
	}
	else
	{
		printf("POSITIVE\t");
	}
	return 0;
}
