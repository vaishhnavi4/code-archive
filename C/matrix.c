#include<stdio.h>

int main()
{
	int A[5][5], k, j;
	for(k = 0; k<5; ++k)
	for(j=0; j<5; j++)
	{
		A[k][j] = A[j][k];
	}
	
}
