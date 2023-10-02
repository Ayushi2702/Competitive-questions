#include <stdio.h>
#include<stdlib.h>
#include<math.h>
struct Node
{
    /* data */
    int data;
    struct Node *next;
}*first=NULL;
void create(int A[],int n)
{
  int i;
  struct Node *last,*t;
  first=(struct Node *)malloc(sizeof(struct Node));
  first->data=A[0];
  first->next=NULL;
  last=first;
  for(i=1;i<n;i++)
  {
    t=(struct Node *)malloc(sizeof(struct Node));
    t->data=A[i];
    t->next=NULL;
    last->next=t;
    last=t;

  }


}


void middle2(struct Node *p)
{   int index;
    int l=0;
    while(p)
    {   
        l++;
        p=p->next;}
        int bla=l/2;
  index= ceil( bla);
   struct Node *q=first;
   for(int i=0;i<index;i++)
   {
    q=q->next;
   }
   printf("%d",q->data);
}



void middle1(struct Node *p)
{
    struct Node *q;
    q=p;
    while(q!=NULL)
    {
        q=q->next;
        if(q){
            q=q->next;
        }
        if(q){
            p=p->next;
        }
    }
    printf("%d\t",p->data);

}



void display(struct Node *p)
{
    while(p!=NULL)
    {
        printf("%d\t",p->data);
        p=p->next;
    }
}

int main()
{
    int A[]={1,2,3,4,5,6,8};
    create(A,7);
    display(first);
    printf("The middle element of this list is :\n");
    middle1(first);
    middle2(first);
    return 0;
}