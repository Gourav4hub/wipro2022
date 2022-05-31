#include<stdio.h>
#define SIZE 10

void swap(int,int);
void printArray();

void merging(int, int, int);
void msort(int,int);

int arr[SIZE] = {121,231,324,31,23,4,12,33,67,44};
int b[SIZE-1];

main()
{
      printArray();
      
      msort(0,SIZE-1);
      
      printArray();
}

void merging(int min, int mid, int max) // 0 0 1
{
   int minPoint, maxPoint, i;

   minPoint = min; // 0
   maxPoint = mid + 1; // 1

   for(i = min; minPoint <= mid && maxPoint <= max; i++) 
   {
      if(arr[minPoint] <= arr[maxPoint])
      {
            b[i] = arr[minPoint];
            minPoint++;
      }
      else
      {
         b[i] = arr[maxPoint];
         maxPoint++;
      }
   }
   
   while(minPoint <= mid)   
   { 
      b[i] = arr[minPoint];
      i++;
      minPoint++;
   }

   while(maxPoint <= max)   
   {
      b[i++] = arr[maxPoint];
      i++;
      maxPoint++;
   }

   for(i = min; i <= max; i++)
   {
       arr[i] = b[i];
   }
}

void msort(int min,int max)
{
      int mid;
      if(min<max)
      {
                  mid = (min+max)/2;
                  msort(min,mid);
                  msort(mid+1,max);
                  merging(min,mid,max); 
      }
}

void swap(int pos1,int pos2)
{
      int z = arr[pos1];
      arr[pos1] = arr[pos2];
      arr[pos2] = z;
}

void printArray()
{
      int x;
     printf("\n***********************************************************************\nArray : ");
      for(x=0; x<SIZE;x++)
      {
            printf("%d ",arr[x]);
      }
    printf("\n************************************************************************ \n");
}
